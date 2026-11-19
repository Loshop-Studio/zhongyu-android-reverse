.class public final synthetic Lz2/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/viewmodel/StudentShareViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/viewmodel/StudentShareViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/n0;->c:Lcom/friday/document/viewmodel/StudentShareViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/n0;->c:Lcom/friday/document/viewmodel/StudentShareViewModel;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->e(Lcom/friday/document/viewmodel/StudentShareViewModel;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
