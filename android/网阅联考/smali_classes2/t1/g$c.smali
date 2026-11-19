.class public final Lt1/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lt1/g$f;


# direct methods
.method public constructor <init>(Lt1/g$f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lt1/g$c;->a:Lt1/g$f;

    return-void
.end method

.method public synthetic constructor <init>(Lt1/g$f;Lt1/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt1/g$c;-><init>(Lt1/g$f;)V

    return-void
.end method


# virtual methods
.method public a()Lt1/c;
    .locals 3

    .line 1
    new-instance v0, Lt1/g$d;

    .line 2
    .line 3
    iget-object v1, p0, Lt1/g$c;->a:Lt1/g$f;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lt1/g$d;-><init>(Lt1/g$f;Lt1/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic build()Le2/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt1/g$c;->a()Lt1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
