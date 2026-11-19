.class public final synthetic Lg5/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/viewmodels/DictViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/y;->a:Lcom/zykj/study/viewmodels/DictViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/y;->a:Lcom/zykj/study/viewmodels/DictViewModel;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/zykj/study/viewmodels/DictViewModel;->a(Lcom/zykj/study/viewmodels/DictViewModel;Ljava/util/List;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
