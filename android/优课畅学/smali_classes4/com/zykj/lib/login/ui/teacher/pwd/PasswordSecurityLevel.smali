.class public final enum Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;

.field public static final enum f:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

.field public static final enum g:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

.field public static final enum h:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

.field public static final synthetic i:[Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

.field public static final synthetic j:Lp7/a;


# instance fields
.field public final a:Lkotlin/text/Regex;

.field public final b:Lkotlin/text/Regex;

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

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
    sget v5, Lcom/zykj/lib/login/R$string;->psd_change_perform_l1:I

    .line 18
    .line 19
    sget v6, Lcom/zykj/lib/login/R$string;->new_pwd_hint_l1:I

    .line 20
    .line 21
    const-string v1, "LEVEL_1"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct/range {v0 .. v6}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->f:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 28
    .line 29
    new-instance v8, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 30
    .line 31
    new-instance v11, Lkotlin/text/Regex;

    .line 32
    .line 33
    const-string v0, "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z\\d]{8,16}$"

    .line 34
    .line 35
    invoke-direct {v11, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v12, Lkotlin/text/Regex;

    .line 39
    .line 40
    invoke-direct {v12, v7}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget v13, Lcom/zykj/lib/login/R$string;->psd_change_perform_l2:I

    .line 44
    .line 45
    sget v14, Lcom/zykj/lib/login/R$string;->new_pwd_hint_l2:I

    .line 46
    .line 47
    const-string v9, "LEVEL_2"

    .line 48
    .line 49
    const/4 v10, 0x1

    .line 50
    invoke-direct/range {v8 .. v14}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V

    .line 51
    .line 52
    .line 53
    sput-object v8, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->g:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 54
    .line 55
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 56
    .line 57
    new-instance v3, Lkotlin/text/Regex;

    .line 58
    .line 59
    const-string v1, "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[`~!@#\\$%^&*()_\\-+=|{}\':;\",\\[\\].<>/?])[a-zA-Z\\d`~!@#\\$%^&*()_\\-+=|{}\':;\",\\[\\].<>/?]{8,16}$"

    .line 60
    .line 61
    invoke-direct {v3, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lkotlin/text/Regex;

    .line 65
    .line 66
    const-string v1, "^[a-zA-Z0-9`~!@#$%^&*()_\\-+=|{}\':;\",\\[\\].<>/?\\\\]*$"

    .line 67
    .line 68
    invoke-direct {v4, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget v5, Lcom/zykj/lib/login/R$string;->psd_change_perform_l3:I

    .line 72
    .line 73
    sget v6, Lcom/zykj/lib/login/R$string;->new_pwd_hint_l3:I

    .line 74
    .line 75
    const-string v1, "LEVEL_3"

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-direct/range {v0 .. v6}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;-><init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->h:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 82
    .line 83
    invoke-static {}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->a()[Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->i:[Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->j:Lp7/a;

    .line 94
    .line 95
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;

    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-direct {v0, v1}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->e:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;

    .line 102
    .line 103
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILkotlin/text/Regex;Lkotlin/text/Regex;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->a:Lkotlin/text/Regex;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->b:Lkotlin/text/Regex;

    .line 7
    .line 8
    iput p5, p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->c:I

    .line 9
    .line 10
    iput p6, p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->d:I

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->f:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    sget-object v1, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->g:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    sget-object v2, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->h:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    filled-new-array {v0, v1, v2}, [Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;
    .locals 1

    const-class v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    return-object p0
.end method

.method public static values()[Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;
    .locals 1

    sget-object v0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->i:[Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lkotlin/text/Regex;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->a:Lkotlin/text/Regex;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->c:I

    .line 2
    .line 3
    return v0
.end method
