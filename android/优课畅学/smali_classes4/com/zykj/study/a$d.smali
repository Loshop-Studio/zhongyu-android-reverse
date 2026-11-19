.class public final Lcom/zykj/study/a$d;
.super Lm4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/a$d$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/a$h;

.field public final b:Lcom/zykj/study/a$d;

.field public c:Ll6/f;


# direct methods
.method public constructor <init>(Lcom/zykj/study/a$h;Li6/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm4/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/zykj/study/a$d;->b:Lcom/zykj/study/a$d;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/a$d;->a:Lcom/zykj/study/a$h;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/a$d;->c(Li6/g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Lg6/a;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/study/a$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/a$d;->a:Lcom/zykj/study/a$h;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/a$d;->b:Lcom/zykj/study/a$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/a$a;-><init>(Lcom/zykj/study/a$h;Lcom/zykj/study/a$d;Lm4/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b()Lc6/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/a$d;->c:Ll6/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lc6/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Li6/g;)V
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/a$d$a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/a$d;->a:Lcom/zykj/study/a$h;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/a$d;->b:Lcom/zykj/study/a$d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p1, v0, v1, v2}, Lcom/zykj/study/a$d$a;-><init>(Lcom/zykj/study/a$h;Lcom/zykj/study/a$d;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/zykj/study/a$d;->c:Ll6/f;

    .line 16
    .line 17
    return-void
.end method
