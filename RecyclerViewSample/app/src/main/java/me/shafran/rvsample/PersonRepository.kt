package me.shafran.rvsample

import android.content.Context
import android.text.TextUtils
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

object PersonRepository {
	private val PERSON_LIST = mutableListOf<Person>()
	fun initialize(context: Context) {
		try {
			BufferedReader(InputStreamReader(context.assets.open("names.txt"))).use { reader ->
				var name = reader.readLine()
				var id: Long = 0
				while (!TextUtils.isEmpty(name)) {
					PERSON_LIST.add(Person(id, name))
					++id
					name = reader.readLine()
				}
			}
		} catch(e: IOException) {
			e.printStackTrace()
			// Ничего не делать
		}
	}

	fun getPersonList(): List<Person> {
		return PERSON_LIST.toList()
	}

	fun getPersonById(id: Long): Person {
		return PERSON_LIST[id.toInt()]
	}
}