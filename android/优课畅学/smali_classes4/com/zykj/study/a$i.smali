.class public final Lcom/zykj/study/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/a$h;

.field public final b:Lcom/zykj/study/a$d;

.field public c:Landroidx/lifecycle/SavedStateHandle;

.field public d:Lc6/c;


# direct methods
.method public constructor <init>(Lcom/zykj/study/a$h;Lcom/zykj/study/a$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/study/a$i;->a:Lcom/zykj/study/a$h;

    .line 4
    iput-object p2, p0, Lcom/zykj/study/a$i;->b:Lcom/zykj/study/a$d;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/study/a$h;Lcom/zykj/study/a$d;Lm4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/study/a$i;-><init>(Lcom/zykj/study/a$h;Lcom/zykj/study/a$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/lifecycle/SavedStateHandle;)Lg6/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/a$i;->d(Landroidx/lifecycle/SavedStateHandle;)Lcom/zykj/study/a$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(Lc6/c;)Lg6/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/a$i;->e(Lc6/c;)Lcom/zykj/study/a$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic build()Ld6/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/a$i;->c()Lm4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lm4/h;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/study/a$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ll6/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/study/a$i;->d:Lc6/c;

    .line 9
    .line 10
    const-class v1, Lc6/c;

    .line 11
    .line 12
    invoke-static {v0, v1}, Ll6/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/zykj/study/a$j;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/study/a$i;->a:Lcom/zykj/study/a$h;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/study/a$i;->b:Lcom/zykj/study/a$d;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/zykj/study/a$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    .line 23
    iget-object v4, p0, Lcom/zykj/study/a$i;->d:Lc6/c;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/study/a$j;-><init>(Lcom/zykj/study/a$h;Lcom/zykj/study/a$d;Landroidx/lifecycle/SavedStateHandle;Lc6/c;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public d(Landroidx/lifecycle/SavedStateHandle;)Lcom/zykj/study/a$i;
    .locals 0

    .line 1
    invoke-static {p1}, Ll6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/study/a$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Lc6/c;)Lcom/zykj/study/a$i;
    .locals 0

    .line 1
    invoke-static {p1}, Ll6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lc6/c;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/study/a$i;->d:Lc6/c;

    .line 8
    .line 9
    return-object p0
.end method
