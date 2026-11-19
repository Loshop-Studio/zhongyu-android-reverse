.class final synthetic Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;

    invoke-direct {v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;-><init>()V

    sput-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;->INSTANCE:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "clearRequests()V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lcom/zykj/mistake/feature/notebook/detail/d;

    const-string v3, "clearRequests"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/d;

    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailAnswerPanelKt$AnswerImagePair$2$2$1;->invoke(Lcom/zykj/mistake/feature/notebook/detail/d;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/mistake/feature/notebook/detail/d;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p1, Lcom/zykj/mistake/feature/notebook/detail/d;->g:Ls/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls/k;->a()V

    .line 3
    :cond_0
    iget-object v0, p1, Lcom/zykj/mistake/feature/notebook/detail/d;->h:Ls/k;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ls/k;->a()V

    :cond_1
    const/4 v0, 0x0

    .line 4
    iput-object v0, p1, Lcom/zykj/mistake/feature/notebook/detail/d;->g:Ls/k;

    .line 5
    iput-object v0, p1, Lcom/zykj/mistake/feature/notebook/detail/d;->h:Ls/k;

    return-void
.end method
