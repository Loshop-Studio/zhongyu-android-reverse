.class public final Lcom/zykj/study/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/a$h;

.field public b:Li6/g;


# direct methods
.method public constructor <init>(Lcom/zykj/study/a$h;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/study/a$c;->a:Lcom/zykj/study/a$h;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/study/a$h;Lm4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/a$c;-><init>(Lcom/zykj/study/a$h;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li6/g;)Lg6/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/a$c;->c(Li6/g;)Lcom/zykj/study/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Lm4/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/a$c;->b:Li6/g;

    .line 2
    .line 3
    const-class v1, Li6/g;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ll6/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/zykj/study/a$d;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/study/a$c;->a:Lcom/zykj/study/a$h;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/study/a$c;->b:Li6/g;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/a$d;-><init>(Lcom/zykj/study/a$h;Li6/g;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic build()Ld6/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/a$c;->b()Lm4/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Li6/g;)Lcom/zykj/study/a$c;
    .locals 0

    .line 1
    invoke-static {p1}, Ll6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Li6/g;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/study/a$c;->b:Li6/g;

    .line 8
    .line 9
    return-object p0
.end method
