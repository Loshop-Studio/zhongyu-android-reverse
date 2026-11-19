.class public abstract Lr8/a;
.super Lr8/c;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/OverScroller;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr8/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/OverScroller;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr8/a;->a:Landroid/widget/OverScroller;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b(IIIIIIIIII)V
    .locals 11

    .line 1
    iget-object v0, p0, Lr8/a;->a:Landroid/widget/OverScroller;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move/from16 v5, p5

    .line 8
    .line 9
    move/from16 v6, p6

    .line 10
    .line 11
    move/from16 v7, p7

    .line 12
    .line 13
    move/from16 v8, p8

    .line 14
    .line 15
    move/from16 v9, p9

    .line 16
    .line 17
    move/from16 v10, p10

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/a;->a:Landroid/widget/OverScroller;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/a;->a:Landroid/widget/OverScroller;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/a;->a:Landroid/widget/OverScroller;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/a;->a:Landroid/widget/OverScroller;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
