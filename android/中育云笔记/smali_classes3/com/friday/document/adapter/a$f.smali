.class public final Lcom/friday/document/adapter/a$f;
.super Lcom/friday/document/adapter/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final b:Lcom/friday/document/adapter/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/document/adapter/a$f;

    invoke-direct {v0}, Lcom/friday/document/adapter/a$f;-><init>()V

    sput-object v0, Lcom/friday/document/adapter/a$f;->b:Lcom/friday/document/adapter/a$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "\u6e05\u7406\u7f13\u5b58"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/friday/document/adapter/a;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/friday/document/adapter/a$f;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x690e20dd

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "clearCache"

    return-object v0
.end method
