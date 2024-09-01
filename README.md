[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/TzGzrp55)
# Program BlueJ Ticket Machine

## Program Description:  
- Live walkthrough of DumbTicketMachine Class
- Make a new constructor that doesnt take input but sets the cost to whatever
- Implement method
  - empty
  - Removes all money from machine
  - Returns void
  - Set total to 0
  - Mutator or accessor?
- Reflect on how bad this class is irl
- Walkthrough SmaterTicketMachine
  - refundBalance method
  - Conditional Statements
  - Test methods using object bench
  - What will happen if we change to amount >= 0
  - Rewrite conditional statement so that error prints if true
    - Reverse behavior
- Implement new method
  - emptyMachine
  - Simulate emptying machine
  - Reset total to 0
  - Return the value that was in total
- Rewrite printTicket
  - Add local variable, amountLeftToPay = price - balance
  - Modify the code so that it integrates this and does not change overall behavior
- Overall QA
  - Make sure you can handle
  - Negative money inserted
  - Refund a balance
  - Empty the machine of the money it collected by printing tickets
  - Smart and not greedy
    - Should only move $$ to total for tickets that are successfully printed)
- Challenge:
  - Create a new class called MyTicketMachine
  - Extend the code from SmarterTicketMachine to add:
  - Different priced tickets (i.e. Senior discount, child discount, etc)
  - Modify any methods or fields to accommodate this change
