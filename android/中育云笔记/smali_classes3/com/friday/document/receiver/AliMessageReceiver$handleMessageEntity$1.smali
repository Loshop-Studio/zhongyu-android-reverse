.class final Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/receiver/AliMessageReceiver;->f(Lcom/friday/document/receiver/AliMessageReceiver$a;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.receiver.AliMessageReceiver"
    f = "AliMessageReceiver.kt"
    l = {
        0x7c,
        0x86
    }
    m = "handleMessageEntity"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lcom/friday/document/receiver/AliMessageReceiver;

.field public k:I


# direct methods
.method public constructor <init>(Lcom/friday/document/receiver/AliMessageReceiver;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->j:Lcom/friday/document/receiver/AliMessageReceiver;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->i:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->k:I

    iget-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->j:Lcom/friday/document/receiver/AliMessageReceiver;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/friday/document/receiver/AliMessageReceiver;->c(Lcom/friday/document/receiver/AliMessageReceiver;Lcom/friday/document/receiver/AliMessageReceiver$a;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
