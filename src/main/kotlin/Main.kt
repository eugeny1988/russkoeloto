import java.io.File

fun main() {
    val ticket1 =  Ticket(
        arrayOf(),
        arrayOf()
    )
    val ticket2: Ticket
    val fileTicket = File("Tickets.txt")
    val tickets = fileTicket.readLines()
    for (i in 1..3) {
        for (j in 0..8)
        ticket1.field1[i][j] += tickets[i].split(' ')[j].toInt()
    }
    println(ticket1.field1)
}