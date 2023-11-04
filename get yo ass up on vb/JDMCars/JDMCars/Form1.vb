Imports SampleClassLibrary

Public Class Form1
    Private Sub carBtn_Click(sender As Object, e As EventArgs) Handles carBtn.Click
        Dim car As New Car

        car.carName = "Honda"
        car.carModel = "Civic TypeR"
        car.carVersion = 2023
        car.carOwner = "Martin"
        car.carColor = "Matte Black"

        ' Combine the properties into a single string for display
        Dim carInfo As String = car.carName & " " & car.carModel & " " & car.carVersion.ToString() & " " & car.carOwner & " " & car.carColor

        ' Show the car information using a MessageBox
        MsgBox(carInfo)

        car.carSound()
    End Sub
End Class
