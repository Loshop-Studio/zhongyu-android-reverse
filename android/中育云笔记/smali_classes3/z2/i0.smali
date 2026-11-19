.class public final synthetic Lz2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/viewmodel/ShareFileViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/i0;->c:Lcom/friday/document/viewmodel/ShareFileViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/i0;->c:Lcom/friday/document/viewmodel/ShareFileViewModel;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->r(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
