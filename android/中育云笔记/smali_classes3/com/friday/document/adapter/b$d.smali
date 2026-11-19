.class public final Lcom/friday/document/adapter/b$d;
.super Lcom/friday/document/adapter/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Lcom/friday/document/adapter/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/document/adapter/b$d;

    invoke-direct {v0}, Lcom/friday/document/adapter/b$d;-><init>()V

    sput-object v0, Lcom/friday/document/adapter/b$d;->a:Lcom/friday/document/adapter/b$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/friday/document/adapter/b;-><init>(Lkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/friday/document/adapter/b$d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x51240ca8    # -1.00021935E-10f

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Time"

    return-object v0
.end method
