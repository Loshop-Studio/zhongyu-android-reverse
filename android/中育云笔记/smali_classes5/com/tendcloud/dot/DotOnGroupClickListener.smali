.class public Lcom/tendcloud/dot/DotOnGroupClickListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/DotOnGroupClickListener$DotOnGroupClickCallback;
    }
.end annotation


# static fields
.field private static a:Lcom/tendcloud/dot/DotOnGroupClickListener$DotOnGroupClickCallback;


# instance fields
.field private b:Landroid/widget/ExpandableListView$OnGroupClickListener;


# direct methods
.method private constructor <init>(Landroid/widget/ExpandableListView$OnGroupClickListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/dot/DotOnGroupClickListener;->b:Landroid/widget/ExpandableListView$OnGroupClickListener;

    .line 5
    .line 6
    return-void
.end method

.method public static getDotOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)Landroid/widget/ExpandableListView$OnGroupClickListener;
    .locals 2

    .line 1
    :try_start_0
    instance-of v0, p0, Lcom/tendcloud/dot/DotOnGroupClickListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/tendcloud/dot/DotOnGroupClickListener;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Lcom/tendcloud/dot/DotOnGroupClickListener;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/tendcloud/dot/DotOnGroupClickListener;->b:Landroid/widget/ExpandableListView$OnGroupClickListener;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/tendcloud/dot/DotOnGroupClickListener;-><init>(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

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
    new-instance v0, Lcom/tendcloud/dot/DotOnGroupClickListener;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/tendcloud/dot/DotOnGroupClickListener;-><init>(Landroid/widget/ExpandableListView$OnGroupClickListener;)V
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
.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 7

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/dot/DotOnGroupClickListener;->a:Lcom/tendcloud/dot/DotOnGroupClickListener$DotOnGroupClickCallback;
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
    move-wide v4, p4

    .line 9
    :try_start_1
    invoke-interface/range {v0 .. v5}, Lcom/tendcloud/dot/DotOnGroupClickListener$DotOnGroupClickCallback;->onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :goto_0
    move-object p1, v0

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move v3, p3

    .line 19
    move-wide v4, p4

    .line 20
    :goto_1
    move-wide v5, v4

    .line 21
    move v4, v3

    .line 22
    move-object v3, v2

    .line 23
    move-object v2, v1

    .line 24
    goto :goto_3

    .line 25
    :catchall_1
    move-exception v0

    .line 26
    move-object v1, p1

    .line 27
    move-object v2, p2

    .line 28
    move v3, p3

    .line 29
    move-wide v4, p4

    .line 30
    goto :goto_0

    .line 31
    :goto_2
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :goto_3
    iget-object v1, p0, Lcom/tendcloud/dot/DotOnGroupClickListener;->b:Landroid/widget/ExpandableListView$OnGroupClickListener;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface/range {v1 .. v6}, Landroid/widget/ExpandableListView$OnGroupClickListener;->onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_1
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public setCallback(Lcom/tendcloud/dot/DotOnGroupClickListener$DotOnGroupClickCallback;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/tendcloud/dot/DotOnGroupClickListener;->a:Lcom/tendcloud/dot/DotOnGroupClickListener$DotOnGroupClickCallback;

    .line 2
    .line 3
    return-void
.end method
