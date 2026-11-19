.class public final Li7/r$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ly7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/r;->e0([D)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:[D


# direct methods
.method public constructor <init>([D)V
    .locals 0

    .line 1
    iput-object p1, p0, Li7/r$e;->a:[D

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Li7/r$e;->a:[D

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/f;->a([D)Li7/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
