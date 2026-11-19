.class public Lw1/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lw1/i;


# direct methods
.method public constructor <init>(Lw1/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw1/i$a;->a:Lw1/i;

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
    invoke-static {}, Lw1/g;->a()Lw1/g$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lec/a;

    .line 6
    .line 7
    iget-object v2, p0, Lw1/i$a;->a:Lw1/i;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lec/a;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lw1/g$e;->a(Lec/a;)Lw1/g$e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lw1/g$e;->b()Lw1/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
