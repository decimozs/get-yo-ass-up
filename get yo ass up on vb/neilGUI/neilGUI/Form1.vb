Imports NEIL
Public Class Form1
    Private Sub Label4_Click(sender As Object, e As EventArgs) Handles Label4.Click

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim studentinfo As New Information

        studentinfo.firstname = TextBox1.Text
        studentinfo.lastname = TextBox2.Text
        studentinfo.program = TextBox3.Text
        studentinfo.grade = TextBox4.Text




    End Sub
End Class
