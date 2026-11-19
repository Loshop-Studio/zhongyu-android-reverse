.class public Lg4/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg4/a;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg4/a;


# direct methods
.method public constructor <init>(Lg4/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg4/a$c;->a:Lg4/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/a$c;->a:Lg4/a;

    .line 2
    .line 3
    iget-object v1, v0, Lg4/a;->e:Lj4/a;

    .line 4
    .line 5
    iget-object v1, v1, Lj4/a;->A:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-static {v0}, Lg4/a;->a(Lg4/a;)Landroid/view/ViewGroup;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lg4/a$c;->a:Lg4/a;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, v1}, Lg4/a;->b(Lg4/a;Z)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lg4/a$c;->a:Lg4/a;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lg4/a;->c(Lg4/a;Z)Z

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lg4/a$c;->a:Lg4/a;

    .line 26
    .line 27
    invoke-static {v0}, Lg4/a;->d(Lg4/a;)Lk4/b;

    .line 28
    .line 29
    .line 30
    return-void
.end method
