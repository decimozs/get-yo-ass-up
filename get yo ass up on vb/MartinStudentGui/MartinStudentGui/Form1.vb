Imports LIBRARY_ACTIVITY_FINALS_1
Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim emp As New Employee
        emp.firstname = TextBox1.Text
        emp.lastname = TextBox2.Text
        emp.program = TextBox3.Text
        emp.grade = TextBox4.Text.ToString
        emp.ratedOfPay = 400

        Dim cemp As New casualEmployee
        cemp.firstname = "Marlon"
        cemp.ratedOfPay = 100
        cemp.hoursWorked = 500

        MsgBox(emp.firstname & " earned " & emp.ratedOfPay & " anually. ")
        MsgBox(emp.firstname & " earned " & emp.calculateMonthly & " monthly. ")

        MsgBox(cemp.firstname & " earned " & cemp.ratedOfPay & " per hour. ")
        MsgBox(cemp.firstname & " earned " & cemp.calculateMonthly & " monthly. ")
    End Sub
End Class
