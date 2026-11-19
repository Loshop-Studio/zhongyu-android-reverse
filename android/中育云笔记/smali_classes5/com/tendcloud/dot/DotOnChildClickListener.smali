.class public Lcom/tendcloud/dot/DotOnChildClickListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/DotOnChildClickListener$DotOnChildClickCallback;
    }
.end annotation


# static fields
.field private static a:Lcom/tendcloud/dot/DotOnChildClickListener$DotOnChildClickCallback;


# instance fields
.field private b:Landroid/widget/ExpandableListView$OnChildClickListener;


# direct methods
.method private constructor <init>(Landroid/widget/ExpandableListView$OnChildClickListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/dot/DotOnChildClickListener;->b:Landroid/widget/ExpandableListView$OnChildClickListener;

    .line 5
    .line 6
    return-void
.end method

.method public static getDotOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)Landroid/widget/ExpandableListView$OnChildClickListener;
    .locals 2

    .line 1
    :try_start_0
    instance-of v0, p0, Lcom/tendcloud/dot/DotOnChildClickListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/tendcloud/dot/DotOnChildClickListener;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Lcom/tendcloud/dot/DotOnChildClickListener;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/tendcloud/dot/DotOnChildClickListener;->b:Landroid/widget/ExpandableListView$OnChildClickListener;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/tendcloud/dot/DotOnChildClickListener;-><init>(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Lcom/tendcloud/dot/DotOnChildClickListener;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/tendcloud/dot/DotOnChildClickListener;-><init>(Landroid/widget/ExpandableListView$OnChildClickListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :goto_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/dot/DotOnChildClickListener;->a:Lcom/tendcloud/dot/DotOnChildClickListener$DotOnChildClickCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move-wide v5, p5

    .line 10
    :try_start_1
    invoke-interface/range {v0 .. v6}, Lcom/tendcloud/dot/DotOnChildClickListener$DotOnChildClickCallback;->onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    :goto_0
    move-object p1, v0

    .line 16
    goto :goto_2

    .line 17
    :cond_0
    move-object v1, p1

    .line 18
    move-object v2, p2

    .line 19
    move v3, p3

    .line 20
    move v4, p4

    .line 21
    move-wide v5, p5

    .line 22
    :goto_1
    move-wide v6, v5

    .line 23
    move v5, v4

    .line 24
    move v4, v3

    .line 25
    move-object v3, v2

    .line 26
    move-object v2, v1

    .line 27
    goto :goto_3

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    move-object v1, p1

    .line 30
    move-object v2, p2

    .line 31
    move v3, p3

    .line 32
    move v4, p4

    .line 33
    move-wide v5, p5

    .line 34
    goto :goto_0

    .line 35
    :goto_2
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :goto_3
    iget-object v1, p0, Lcom/tendcloud/dot/DotOnChildClickListener;->b:Landroid/widget/ExpandableListView$OnChildClickListener;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface/range {v1 .. v7}, Landroid/widget/ExpandableListView$OnChildClickListener;->onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    return p1
.end method

.method public setCallback(Lcom/tendcloud/dot/DotOnChildClickListener$DotOnChildClickCallback;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/tendcloud/dot/DotOnChildClickListener;->a:Lcom/tendcloud/dot/DotOnChildClickListener$DotOnChildClickCallback;

    .line 2
    .line 3
    return-void
.end method
