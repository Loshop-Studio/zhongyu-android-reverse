.class public final Lu8/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ly7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu8/j;->b(Lu8/f;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu8/f;


# direct methods
.method public constructor <init>(Lu8/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu8/j$d;->a:Lu8/f;

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
    .locals 2

    .line 1
    new-instance v0, Lu8/j$b;

    .line 2
    .line 3
    iget-object v1, p0, Lu8/j$d;->a:Lu8/f;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lu8/j$b;-><init>(Lu8/f;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
