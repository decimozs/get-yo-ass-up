Public Class Information
    Dim stFirstName As String
    Dim stLastName As String
    Dim stDateOfBirth As Date

    Public Property firstName As String
        Set(value As String)
            stFirstName = value
        End Set
        Get
            Return stFirstName
        End Get
    End Property

    Public Property lastName As String
        Set(value As String)
            stLastName = value
        End Set
        Get
            Return stLastName
        End Get
    End Property

    Public Property dateOfBirth As Date
        Set(value As Date)
            If (Year(Now) - Year(value)) < 18 Then
                MsgBox("Hey! " + stFirstName + " You must 18 years Old!")
            ElseIf stDateOfBirth = value Then
            End If
        End Set
        Get

        End Get
    End Property
End Class
