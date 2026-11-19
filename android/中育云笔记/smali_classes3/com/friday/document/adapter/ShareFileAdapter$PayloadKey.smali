.class public final enum Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/ShareFileAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PayloadKey"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

.field public static final synthetic d:[Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

.field public static final synthetic e:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    .line 2
    .line 3
    const-string v1, "SELECTED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->c:Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    .line 10
    .line 11
    invoke-static {}, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->a()[Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->d:[Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->e:Lyc/a;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()[Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->c:Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    filled-new-array {v0}, [Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;
    .locals 1

    const-class v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    return-object p0
.end method

.method public static values()[Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;
    .locals 1

    sget-object v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->d:[Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    return-object v0
.end method
