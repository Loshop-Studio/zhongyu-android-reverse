.class final Landroidx/paging/PagingDataPresenter$InitialUiReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/paging/UiReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PagingDataPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InitialUiReceiver"
.end annotation


# instance fields
.field private refresh:Z

.field private retry:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getRefresh()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->refresh:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRetry()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->retry:Z

    .line 2
    .line 3
    return v0
.end method

.method public refresh()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->refresh:Z

    .line 3
    .line 4
    return-void
.end method

.method public retry()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->retry:Z

    .line 3
    .line 4
    return-void
.end method

.method public final setRefresh(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->refresh:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setRetry(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->retry:Z

    .line 2
    .line 3
    return-void
.end method
