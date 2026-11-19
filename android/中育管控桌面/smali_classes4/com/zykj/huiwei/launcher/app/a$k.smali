.class public final Lcom/zykj/huiwei/launcher/app/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public final b:Lcom/zykj/huiwei/launcher/app/a$d;

.field public c:Landroidx/lifecycle/SavedStateHandle;

.field public d:Lr4/c;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$k;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$k;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Lr3/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/huiwei/launcher/app/a$k;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/lifecycle/SavedStateHandle;)Lv4/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$k;->d(Landroidx/lifecycle/SavedStateHandle;)Lcom/zykj/huiwei/launcher/app/a$k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(Lr4/c;)Lv4/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$k;->e(Lr4/c;)Lcom/zykj/huiwei/launcher/app/a$k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic build()Ls4/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$k;->c()Lr3/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lr3/h;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$k;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    .line 4
    .line 5
    invoke-static {v0, v1}, La5/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$k;->d:Lr4/c;

    .line 9
    .line 10
    const-class v1, Lr4/c;

    .line 11
    .line 12
    invoke-static {v0, v1}, La5/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$l;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$k;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$k;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/app/a$k;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    .line 23
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/app/a$k;->d:Lr4/c;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/huiwei/launcher/app/a$l;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Landroidx/lifecycle/SavedStateHandle;Lr4/c;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public d(Landroidx/lifecycle/SavedStateHandle;)Lcom/zykj/huiwei/launcher/app/a$k;
    .locals 0

    .line 1
    invoke-static {p1}, La5/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$k;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Lr4/c;)Lcom/zykj/huiwei/launcher/app/a$k;
    .locals 0

    .line 1
    invoke-static {p1}, La5/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lr4/c;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$k;->d:Lr4/c;

    .line 8
    .line 9
    return-object p0
.end method
