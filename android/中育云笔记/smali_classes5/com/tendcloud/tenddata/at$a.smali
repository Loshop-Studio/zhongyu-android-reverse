.class Lcom/tendcloud/tenddata/at$a;
.super Ljava/lang/Throwable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x65bb3ca323055105L


# instance fields
.field private preferedsize:I

.field final synthetic this$0:Lcom/tendcloud/tenddata/at;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/at;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/at$a;->this$0:Lcom/tendcloud/tenddata/at;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lcom/tendcloud/tenddata/at$a;->preferedsize:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getPreferedSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tendcloud/tenddata/at$a;->preferedsize:I

    .line 2
    .line 3
    return v0
.end method
