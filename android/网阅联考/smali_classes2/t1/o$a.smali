.class public Lt1/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/hilt/android/internal/managers/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lt1/o;


# direct methods
.method public constructor <init>(Lt1/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt1/o$a;->a:Lt1/o;

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
    invoke-static {}, Lt1/g;->a()Lt1/g$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Li2/a;

    .line 6
    .line 7
    iget-object v2, p0, Lt1/o$a;->a:Lt1/o;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Li2/a;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lt1/g$e;->a(Li2/a;)Lt1/g$e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lt1/g$e;->b()Lt1/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
