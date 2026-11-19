.class public final synthetic Lx2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/StudentShareFragment;

.field public final synthetic d:I

.field public final synthetic e:Lcom/friday/document/model/ShareFile;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/StudentShareFragment;ILcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/a0;->c:Lcom/friday/document/view/share/StudentShareFragment;

    iput p2, p0, Lx2/a0;->d:I

    iput-object p3, p0, Lx2/a0;->e:Lcom/friday/document/model/ShareFile;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx2/a0;->c:Lcom/friday/document/view/share/StudentShareFragment;

    iget v1, p0, Lx2/a0;->d:I

    iget-object v2, p0, Lx2/a0;->e:Lcom/friday/document/model/ShareFile;

    invoke-static {v0, v1, v2}, Lcom/friday/document/view/share/StudentShareFragment;->t(Lcom/friday/document/view/share/StudentShareFragment;ILcom/friday/document/model/ShareFile;)V

    return-void
.end method
