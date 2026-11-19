.class public final synthetic Lv2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/BaseDocumentFragment;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/g;->c:Lcom/friday/document/view/document/BaseDocumentFragment;

    iput-object p2, p0, Lv2/g;->d:Ljava/lang/String;

    iput-object p3, p0, Lv2/g;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lv2/g;->c:Lcom/friday/document/view/document/BaseDocumentFragment;

    iget-object v1, p0, Lv2/g;->d:Ljava/lang/String;

    iget-object v2, p0, Lv2/g;->e:Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->s(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
