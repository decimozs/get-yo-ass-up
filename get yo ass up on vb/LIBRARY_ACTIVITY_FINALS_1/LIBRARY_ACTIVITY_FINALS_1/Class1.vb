Imports System.Windows.Automation

Public Class Information
    Dim stFirstName As String
    Dim stLastName As String
    Dim stProgram As String
    Dim stGrade As Integer
    Dim passOrFailed As String

    Public Property firstname As String
        Set(value As String)
            stFirstName = value
        End Set
        Get
            Return stFirstName
        End Get
    End Property

    Public Property lastname As String
        Set(value As String)
            stLastName = value
        End Set
        Get
            Return stLastName
        End Get
    End Property

    Public Property program As String
        Set(value As String)
            stProgram = value
        End Set
        Get
            Return stProgram
        End Get
    End Property

    Public Property grade As String
        Set(value As String)
            stGrade = value
            If stGrade < 75 Then

                passOrFailed = "You Failed!"
            Else

                passOrFailed = "You Passed!"
            End If
        End Set
        Get
            Return passOrFailed
        End Get
    End Property
End Class

Public Class Employee
    Inherits Information
    Dim stJobRole As String
    Public stRatedOfPay As Decimal

    Public Property jobRole As String
        Set(value As String)
            stJobRole = value
        End Set
        Get
            Return stJobRole
        End Get
    End Property

    Public Property ratedOfPay As Decimal
        Set(value As Decimal)
            stRatedOfPay = value
        End Set
        Get
            Return stRatedOfPay
        End Get
    End Property

    Public Overridable Function calculateMonthly() As Integer
        Dim decMonthlyWage As Decimal
        decMonthlyWage = stRatedOfPay / 12
        Return decMonthlyWage
    End Function
End Class


Public Class casualEmployee
    Inherits Employee
    Dim stHoursWorked As Integer

    Public Property hoursWorked As Integer
        Set(value As Integer)
            stHoursWorked = value
        End Set
        Get
            Return stHoursWorked
        End Get
    End Property

    Public Overrides Function calculateMonthly() As Integer
        Dim decMonthlyWage As Decimal
        decMonthlyWage = stHoursWorked * stRatedOfPay
        Return decMonthlyWage
    End Function
End Class
