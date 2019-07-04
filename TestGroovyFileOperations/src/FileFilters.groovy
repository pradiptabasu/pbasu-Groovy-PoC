
class FileFilters {
	static main(args) {
		String fileLocation = "D:\\Github_Clone\\VodafoneGermanyPega\\PegaSQLScripts"
		new File(fileLocation).eachFileMatch(~/.*\.sql$/) { file ->
			println file.name
			println file.getName()
			println file.getAbsolutePath()
			//pluginSet.add(file.getName());
		}
	}
}
