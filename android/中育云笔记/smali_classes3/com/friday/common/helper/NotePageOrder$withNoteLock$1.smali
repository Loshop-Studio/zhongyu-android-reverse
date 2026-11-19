.class final Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/helper/NotePageOrder;->e(Ljava/lang/String;Lhd/l;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.helper.NotePageOrder"
    f = "NotePageOrder.kt"
    l = {
        0x31,
        0xe
    }
    m = "withNoteLock"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/friday/common/helper/NotePageOrder;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/friday/common/helper/NotePageOrder;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->i:Lcom/friday/common/helper/NotePageOrder;

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

    iput-object p1, p0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->h:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->j:I

    iget-object p1, p0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->i:Lcom/friday/common/helper/NotePageOrder;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/friday/common/helper/NotePageOrder;->e(Ljava/lang/String;Lhd/l;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
