.class final Lcom/friday/document/service/FileManager$syncTree$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->I(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.service.FileManager"
    f = "FileManager.kt"
    l = {
        0xa2,
        0xa2,
        0xa5
    }
    m = "syncTree"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:J

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/friday/document/service/FileManager;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/friday/document/service/FileManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$syncTree$1;->i:Lcom/friday/document/service/FileManager;

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
    .locals 3

    iput-object p1, p0, Lcom/friday/document/service/FileManager$syncTree$1;->h:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

    iget-object p1, p0, Lcom/friday/document/service/FileManager$syncTree$1;->i:Lcom/friday/document/service/FileManager;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lcom/friday/document/service/FileManager;->I(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
