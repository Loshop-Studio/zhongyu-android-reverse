.class public final Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->f:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    sget-object p1, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->h:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_1
    sget-object p1, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->g:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 14
    .line 15
    return-object p1
.end method
