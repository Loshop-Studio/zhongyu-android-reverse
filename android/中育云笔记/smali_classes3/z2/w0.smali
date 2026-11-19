.class public final synthetic Lz2/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/viewmodel/TxtEditViewModel;

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/w0;->c:Lcom/friday/document/viewmodel/TxtEditViewModel;

    iput-object p2, p0, Lz2/w0;->d:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/w0;->c:Lcom/friday/document/viewmodel/TxtEditViewModel;

    iget-object v1, p0, Lz2/w0;->d:Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, v1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->f(Lcom/friday/document/viewmodel/TxtEditViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
