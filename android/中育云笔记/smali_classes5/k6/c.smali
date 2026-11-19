.class public Lk6/c;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Landroid/content/Context;I)Landroid/content/ContextWrapper;
    .locals 1

    .line 1
    const/4 v0, -0x2

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    invoke-static {p0, p1}, Lr6/b;->d(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance p1, Lk6/c;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Lk6/c;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method


# virtual methods
.method public getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "audio"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
