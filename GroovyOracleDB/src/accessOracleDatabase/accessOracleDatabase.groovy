import groovy.sql.Sql

// Oracle DB Settings
def dbSchema = 'PEGADATADEV23'
def dbServer = 'PEGADMZ'
def dbUser = 'PEGADATADEV23'
def dbPassword = 'PEGADATADEV23' 
def dbDriver = 'oracle.jdbc.driver.OracleDriver'
def dbUrl = 'jdbc:oracle:thin:@' + dbServer + ':' + dbSchema
sql = Sql.newInstance( dbUrl, dbUser, dbPassword, dbDriver )

// Read data
def row = sql.firstRow("SELECT * FROM tab")
println row