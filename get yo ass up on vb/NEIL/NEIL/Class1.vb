Public Class Information

    Dim stfirstname As String
    Dim stlastname As String
    Dim stprogram As String
    Dim stgrade As Integer

    Public Property firstname As String
        Set(value As String)
            stfirstname = value
        End Set
        Get
            Return stfirstname
        End Get
    End Property


    Public Property lastname As String
        Set(value As String)
            stlastname = value
        End Set
        Get
            Return stlastname
        End Get
    End Property


    Public Property program As String
        Set(value As String)
            stprogram = value
        End Set
        Get
            Return stprogram
        End Get
    End Property

    Public Property grade As Integer
        Set(value As Integer)
            stgrade = value
            If stgrade < 75 Then
                MsgBox(Me.firstname & " " & " BAGSAK KA!!")
            Else
                MsgBox(Me.firstname & " " & " PASADO KA!!!")
            End If
        End Set
        Get

        End Get
    End Property
End Class
