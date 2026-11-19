.class public final synthetic Landroidx/lifecycle/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/lifecycle/MediatorLiveData;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/MediatorLiveData;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/p;->c:Landroidx/lifecycle/MediatorLiveData;

    iput-object p2, p0, Landroidx/lifecycle/p;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/p;->c:Landroidx/lifecycle/MediatorLiveData;

    iget-object v1, p0, Landroidx/lifecycle/p;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-static {v0, v1, p1}, Landroidx/lifecycle/Transformations;->d(Landroidx/lifecycle/MediatorLiveData;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/Object;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
