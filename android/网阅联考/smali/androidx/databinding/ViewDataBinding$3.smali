.class final Landroidx/databinding/ViewDataBinding$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/databinding/ViewDataBinding$CreateWeakListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/databinding/ViewDataBinding;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Landroidx/databinding/ViewDataBinding;I)Landroidx/databinding/ViewDataBinding$WeakListener;
    .locals 1

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$WeakMapListener;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/databinding/ViewDataBinding$WeakMapListener;-><init>(Landroidx/databinding/ViewDataBinding;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding$WeakMapListener;->getListener()Landroidx/databinding/ViewDataBinding$WeakListener;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
