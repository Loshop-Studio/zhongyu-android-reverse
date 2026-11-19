.class public abstract Le0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Le0/e;->c:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;)Landroid/app/Notification;
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le0/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Le0/e;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le0/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le0/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le0/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Le0/e;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le0/e;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le0/e;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le0/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le0/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
