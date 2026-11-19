.class public abstract Lcom/friday/lecture/model/ConnectMode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/model/ConnectMode$Code;,
        Lcom/friday/lecture/model/ConnectMode$IP;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final keyboardList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final passwordMaxSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/friday/lecture/model/ConnectMode;->passwordMaxSize:I

    .line 4
    iput-object p2, p0, Lcom/friday/lecture/model/ConnectMode;->keyboardList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/lecture/model/ConnectMode;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getKeyboardList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/model/ConnectMode;->keyboardList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPasswordMaxSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/model/ConnectMode;->passwordMaxSize:I

    .line 2
    .line 3
    return v0
.end method
