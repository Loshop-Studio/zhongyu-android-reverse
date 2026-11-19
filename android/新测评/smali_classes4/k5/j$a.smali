.class public Lk5/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lk5/j;


# direct methods
.method public constructor <init>(Lk5/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/j$a;->a:Lk5/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lk5/h;->a()Lk5/h$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lm8/a;

    .line 6
    .line 7
    iget-object v2, p0, Lk5/j$a;->a:Lk5/j;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lm8/a;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lk5/h$e;->a(Lm8/a;)Lk5/h$e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lk5/h$e;->b()Lk5/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
