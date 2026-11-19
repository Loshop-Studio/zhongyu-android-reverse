.class public final enum Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB-\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000b\u001a\u0004\u0008\u000f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u0012j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;",
        "",
        "Lkotlin/text/Regex;",
        "regex",
        "allowedCharsRegex",
        "",
        "toastResId",
        "placeholderResId",
        "<init>",
        "(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V",
        "a",
        "Lkotlin/text/Regex;",
        "c",
        "()Lkotlin/text/Regex;",
        "b",
        "getAllowedCharsRegex",
        "I",
        "d",
        "()I",
        "e",
        "f",
        "g",
        "h",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;

.field public static final enum f:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

.field public static final enum g:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

.field public static final enum h:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

.field public static final synthetic i:[Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

.field public static final synthetic j:Lkotlin/enums/EnumEntries;


# instance fields
.field public final a:Lkotlin/text/Regex;

.field public final b:Lkotlin/text/Regex;

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 2
    .line 3
    new-instance v3, Lkotlin/text/Regex;

    .line 4
    .line 5
    const-string v1, "^(?=.*\\d)(?=.*[a-zA-Z])[a-zA-Z\\d]{8,16}$"

    .line 6
    .line 7
    invoke-direct {v3, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v4, Lkotlin/text/Regex;

    .line 11
    .line 12
    const-string v7, "[a-zA-Z\\d]*"

    .line 13
    .line 14
    invoke-direct {v4, v7}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v5, 0x7f110174

    .line 18
    .line 19
    .line 20
    const v6, 0x7f110158

    .line 21
    .line 22
    .line 23
    const-string v1, "LEVEL_1"

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct/range {v0 .. v6}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->f:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 30
    .line 31
    new-instance v8, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 32
    .line 33
    new-instance v11, Lkotlin/text/Regex;

    .line 34
    .line 35
    const-string v0, "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z\\d]{8,16}$"

    .line 36
    .line 37
    invoke-direct {v11, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v12, Lkotlin/text/Regex;

    .line 41
    .line 42
    invoke-direct {v12, v7}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const v13, 0x7f110175

    .line 46
    .line 47
    .line 48
    const v14, 0x7f110159

    .line 49
    .line 50
    .line 51
    const-string v9, "LEVEL_2"

    .line 52
    .line 53
    const/4 v10, 0x1

    .line 54
    invoke-direct/range {v8 .. v14}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V

    .line 55
    .line 56
    .line 57
    sput-object v8, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->g:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 58
    .line 59
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 60
    .line 61
    new-instance v3, Lkotlin/text/Regex;

    .line 62
    .line 63
    const-string v1, "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[`~!@#\\$%^&*()_\\-+=|{}\':;\",\\[\\].<>/?])[a-zA-Z\\d`~!@#\\$%^&*()_\\-+=|{}\':;\",\\[\\].<>/?]{8,16}$"

    .line 64
    .line 65
    invoke-direct {v3, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v4, Lkotlin/text/Regex;

    .line 69
    .line 70
    const-string v1, "^[a-zA-Z0-9`~!@#$%^&*()_\\-+=|{}\':;\",\\[\\].<>/?\\\\]*$"

    .line 71
    .line 72
    invoke-direct {v4, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const v5, 0x7f110176

    .line 76
    .line 77
    .line 78
    const v6, 0x7f11015a

    .line 79
    .line 80
    .line 81
    const-string v1, "LEVEL_3"

    .line 82
    .line 83
    const/4 v2, 0x2

    .line 84
    invoke-direct/range {v0 .. v6}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V

    .line 85
    .line 86
    .line 87
    sput-object v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->h:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 88
    .line 89
    invoke-static {}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->a()[Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->i:[Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 94
    .line 95
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->j:Lkotlin/enums/EnumEntries;

    .line 100
    .line 101
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->e:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;

    .line 108
    .line 109
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->a:Lkotlin/text/Regex;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->b:Lkotlin/text/Regex;

    .line 7
    .line 8
    iput p5, p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->c:I

    .line 9
    .line 10
    iput p6, p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->d:I

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->f:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    sget-object v1, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->g:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    sget-object v2, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->h:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    filled-new-array {v0, v1, v2}, [Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;
    .locals 1

    const-class v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    return-object p0
.end method

.method public static values()[Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;
    .locals 1

    sget-object v0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->i:[Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lkotlin/text/Regex;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->a:Lkotlin/text/Regex;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->c:I

    .line 2
    .line 3
    return v0
.end method
