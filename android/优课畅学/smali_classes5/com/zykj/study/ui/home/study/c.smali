.class public final synthetic Lcom/zykj/study/ui/home/study/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->c(Landroidx/paging/CombinedLoadStates;)Landroidx/paging/LoadStates;

    move-result-object p1

    return-object p1
.end method
