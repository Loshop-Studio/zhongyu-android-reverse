.class public final synthetic Landroidx/lifecycle/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lhd/l;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic e:Landroidx/lifecycle/MediatorLiveData;


# direct methods
.method public synthetic constructor <init>(Lhd/l;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/lifecycle/MediatorLiveData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/n;->c:Lhd/l;

    iput-object p2, p0, Landroidx/lifecycle/n;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Landroidx/lifecycle/n;->e:Landroidx/lifecycle/MediatorLiveData;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/n;->c:Lhd/l;

    iget-object v1, p0, Landroidx/lifecycle/n;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Landroidx/lifecycle/n;->e:Landroidx/lifecycle/MediatorLiveData;

    invoke-static {v0, v1, v2, p1}, Landroidx/lifecycle/Transformations;->e(Lhd/l;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/lifecycle/MediatorLiveData;Ljava/lang/Object;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
