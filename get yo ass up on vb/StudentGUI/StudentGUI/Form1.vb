Imports Student
Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim studentInfo As New Information

        studentInfo.firstName = "Marlon"
        studentInfo.lastName = "Martin"
        studentInfo.dateOfBirth = #10/10/2050#

        MsgBox(studentInfo.firstName)
        MsgBox(studentInfo.lastName)
        MsgBox(studentInfo.dateOfBirth)
    End Sub
End Class
