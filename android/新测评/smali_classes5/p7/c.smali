.class public final Lp7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp7/c$a;
    }
.end annotation


# static fields
.field public static a:[Ljava/lang/String;

.field public static b:[Ljava/lang/String;

.field public static c:[Ljava/lang/String;

.field public static d:[Lp7/c$a;

.field public static final e:Lp7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lp7/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp7/c;->e:Lp7/c;

    .line 7
    .line 8
    const-string v9, "\u516b"

    .line 9
    .line 10
    const-string v10, "\u4e5d"

    .line 11
    .line 12
    const-string v1, "\u96f6"

    .line 13
    .line 14
    const-string v2, "\u4e00"

    .line 15
    .line 16
    const-string v3, "\u4e8c"

    .line 17
    .line 18
    const-string v4, "\u4e09"

    .line 19
    .line 20
    const-string v5, "\u56db"

    .line 21
    .line 22
    const-string v6, "\u4e94"

    .line 23
    .line 24
    const-string v7, "\u516d"

    .line 25
    .line 26
    const-string v8, "\u4e03"

    .line 27
    .line 28
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lp7/c;->a:[Ljava/lang/String;

    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    const-string v1, "\u5341"

    .line 37
    .line 38
    const-string v2, "\u767e"

    .line 39
    .line 40
    const-string v3, "\u5343"

    .line 41
    .line 42
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    sput-object v4, Lp7/c;->b:[Ljava/lang/String;

    .line 47
    .line 48
    const-string v4, "\u4e07\u4ebf"

    .line 49
    .line 50
    const-string v5, "\u4e07"

    .line 51
    .line 52
    const-string v6, "\u4ebf"

    .line 53
    .line 54
    filled-new-array {v0, v5, v6, v4}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lp7/c;->c:[Ljava/lang/String;

    .line 59
    .line 60
    new-instance v0, Lp7/c$a;

    .line 61
    .line 62
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 63
    .line 64
    const/16 v7, 0xa

    .line 65
    .line 66
    invoke-direct {v0, v1, v7, v4}, Lp7/c$a;-><init>(Ljava/lang/String;ILjava/lang/Boolean;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lp7/c$a;

    .line 70
    .line 71
    const/16 v7, 0x64

    .line 72
    .line 73
    invoke-direct {v1, v2, v7, v4}, Lp7/c$a;-><init>(Ljava/lang/String;ILjava/lang/Boolean;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lp7/c$a;

    .line 77
    .line 78
    const/16 v7, 0x3e8

    .line 79
    .line 80
    invoke-direct {v2, v3, v7, v4}, Lp7/c$a;-><init>(Ljava/lang/String;ILjava/lang/Boolean;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lp7/c$a;

    .line 84
    .line 85
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    const/16 v7, 0x2710

    .line 88
    .line 89
    invoke-direct {v3, v5, v7, v4}, Lp7/c$a;-><init>(Ljava/lang/String;ILjava/lang/Boolean;)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Lp7/c$a;

    .line 93
    .line 94
    const v7, 0x5f5e100

    .line 95
    .line 96
    .line 97
    invoke-direct {v5, v6, v7, v4}, Lp7/c$a;-><init>(Ljava/lang/String;ILjava/lang/Boolean;)V

    .line 98
    .line 99
    .line 100
    filled-new-array {v0, v1, v2, v3, v5}, [Lp7/c$a;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sput-object v0, Lp7/c;->d:[Lp7/c$a;

    .line 105
    .line 106
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    sget-object v2, Lp7/c;->a:[Ljava/lang/String;

    .line 10
    .line 11
    aget-object v2, v2, v1

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 14
    .line 15
    .line 16
    :cond_0
    move v2, v1

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-lez p1, :cond_5

    .line 19
    .line 20
    rem-int/lit16 v4, p1, 0x2710

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    sget-object v2, Lp7/c;->a:[Ljava/lang/String;

    .line 25
    .line 26
    aget-object v2, v2, v1

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, v4}, Lp7/c;->b(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    sget-object v2, Lp7/c;->c:[Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    aget-object v2, v2, v3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    aget-object v2, v2, v1

    .line 51
    .line 52
    :goto_1
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    if-le v2, v4, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const/16 v5, 0x3e7

    .line 67
    .line 68
    if-lt v5, v4, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    :goto_2
    move v2, v1

    .line 72
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    div-int/lit16 p1, p1, 0x2710

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string v0, "returnStr.toString()"

    .line 82
    .line 83
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p1
.end method

.method public final b(I)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    move v3, v1

    .line 9
    move v4, v2

    .line 10
    :goto_0
    if-lez p1, :cond_3

    .line 11
    .line 12
    rem-int/lit8 v5, p1, 0xa

    .line 13
    .line 14
    if-nez v5, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    if-nez v4, :cond_2

    .line 19
    .line 20
    :cond_0
    sget-object v4, Lp7/c;->a:[Ljava/lang/String;

    .line 21
    .line 22
    aget-object v4, v4, v5

    .line 23
    .line 24
    invoke-virtual {v0, v1, v4}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 25
    .line 26
    .line 27
    move v4, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    new-instance v4, Ljava/lang/StringBuffer;

    .line 30
    .line 31
    sget-object v6, Lp7/c;->a:[Ljava/lang/String;

    .line 32
    .line 33
    aget-object v5, v6, v5

    .line 34
    .line 35
    invoke-direct {v4, v5}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v5, Lp7/c;->b:[Ljava/lang/String;

    .line 39
    .line 40
    aget-object v5, v5, v3

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v4}, Ljava/lang/StringBuffer;->insert(ILjava/lang/CharSequence;)Ljava/lang/StringBuffer;

    .line 46
    .line 47
    .line 48
    move v4, v1

    .line 49
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    div-int/lit8 p1, p1, 0xa

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "returnStr.toString()"

    .line 59
    .line 60
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method
