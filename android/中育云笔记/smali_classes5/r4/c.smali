.class public abstract Lr4/c;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Lr4/d;)Lr4/c;
    .locals 0

    .line 1
    invoke-static {p0}, Lv4/b;->h(Lr4/d;)Lr4/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static c()Lr4/c;
    .locals 1

    .line 1
    invoke-static {}, Lv4/b;->f()Lr4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "AGConnectInstance"

    .line 2
    .line 3
    const-string v1, "AGConnectInstance#initialize"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lv4/b;->j(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract d()Lr4/d;
.end method
