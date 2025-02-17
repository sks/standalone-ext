package io.shiftleft.codepropertygraph.generated.nodes

/** base type for all nodes that can be added to a graph, e.g. the diffgraph */
abstract class NewNode extends AbstractNode with overflowdb.DetachedNodeData with Product {
  def properties: Map[String, Any]
  def copy: this.type
  type StoredType <: StoredNode
  private var refOrId: Object              = null
  override def getRefOrId(): Object        = refOrId
  override def setRefOrId(r: Object): Unit = { this.refOrId = r }
  def stored: Option[StoredType] =
    if (refOrId != null && refOrId.isInstanceOf[StoredNode]) Some(refOrId).asInstanceOf[Option[StoredType]] else None
}

object NewAnnotation {
  def apply(): NewAnnotation = new NewAnnotation
}

class NewAnnotation extends NewNode with AnnotationBase with ExpressionNew {
  type StoredType = Annotation

  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var fullName: String              = "<empty>"
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var argumentName: Option[String]  = None
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "ANNOTATION"

  override def copy: this.type = {
    val newInstance = new NewAnnotation
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.fullName = this.fullName
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def fullName(value: String): this.type = {
    this.fullName = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == fullName)) { res += "FULL_NAME" -> fullName }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.name
      case 2 => this.lineNumber
      case 3 => this.fullName
      case 4 => this.columnNumber
      case 5 => this.code
      case 6 => this.argumentName
      case 7 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "name"
      case 2 => "lineNumber"
      case 3 => "fullName"
      case 4 => "columnNumber"
      case 5 => "code"
      case 6 => "argumentName"
      case 7 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewAnnotation"
  override def productArity  = 8

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewAnnotation]
}

object NewAnnotationLiteral {
  def apply(): NewAnnotationLiteral = new NewAnnotationLiteral
}

class NewAnnotationLiteral extends NewNode with AnnotationLiteralBase with ExpressionNew {
  type StoredType = AnnotationLiteral

  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var argumentName: Option[String]  = None
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "ANNOTATION_LITERAL"

  override def copy: this.type = {
    val newInstance = new NewAnnotationLiteral
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.name
      case 2 => this.lineNumber
      case 3 => this.columnNumber
      case 4 => this.code
      case 5 => this.argumentName
      case 6 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "name"
      case 2 => "lineNumber"
      case 3 => "columnNumber"
      case 4 => "code"
      case 5 => "argumentName"
      case 6 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewAnnotationLiteral"
  override def productArity  = 7

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewAnnotationLiteral]
}

object NewAnnotationParameter {
  def apply(): NewAnnotationParameter = new NewAnnotationParameter
}

class NewAnnotationParameter extends NewNode with AnnotationParameterBase with AstNodeNew {
  type StoredType = AnnotationParameter

  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "ANNOTATION_PARAMETER"

  override def copy: this.type = {
    val newInstance = new NewAnnotationParameter
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.columnNumber
      case 3 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "columnNumber"
      case 3 => "code"
      case _ => ""
    }

  override def productPrefix = "NewAnnotationParameter"
  override def productArity  = 4

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewAnnotationParameter]
}

object NewAnnotationParameterAssign {
  def apply(): NewAnnotationParameterAssign = new NewAnnotationParameterAssign
}

class NewAnnotationParameterAssign extends NewNode with AnnotationParameterAssignBase with AstNodeNew {
  type StoredType = AnnotationParameterAssign

  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "ANNOTATION_PARAMETER_ASSIGN"

  override def copy: this.type = {
    val newInstance = new NewAnnotationParameterAssign
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.columnNumber
      case 3 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "columnNumber"
      case 3 => "code"
      case _ => ""
    }

  override def productPrefix = "NewAnnotationParameterAssign"
  override def productArity  = 4

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewAnnotationParameterAssign]
}

object NewArrayInitializer {
  def apply(): NewArrayInitializer = new NewArrayInitializer
}

class NewArrayInitializer extends NewNode with ArrayInitializerBase with AstNodeNew with ExpressionNew {
  type StoredType = ArrayInitializer

  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var argumentName: Option[String]  = None
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "ARRAY_INITIALIZER"

  override def copy: this.type = {
    val newInstance = new NewArrayInitializer
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.columnNumber
      case 3 => this.code
      case 4 => this.argumentName
      case 5 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "columnNumber"
      case 3 => "code"
      case 4 => "argumentName"
      case 5 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewArrayInitializer"
  override def productArity  = 6

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewArrayInitializer]
}

object NewBinding {
  def apply(): NewBinding = new NewBinding
}

class NewBinding extends NewNode with BindingBase {
  type StoredType = Binding

  var signature: String      = ""
  var name: String           = "<empty>"
  var methodFullName: String = "<empty>"

  override def label: String = "BINDING"

  override def copy: this.type = {
    val newInstance = new NewBinding
    newInstance.methodFullName = this.methodFullName
    newInstance.name = this.name
    newInstance.signature = this.signature
    newInstance.asInstanceOf[this.type]
  }

  def methodFullName(value: String): this.type = {
    this.methodFullName = value
    this
  }

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def signature(value: String): this.type = {
    this.signature = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == methodFullName)) { res += "METHOD_FULL_NAME" -> methodFullName }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!(("") == signature)) { res += "SIGNATURE" -> signature }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.signature
      case 1 => this.name
      case 2 => this.methodFullName
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "signature"
      case 1 => "name"
      case 2 => "methodFullName"
      case _ => ""
    }

  override def productPrefix = "NewBinding"
  override def productArity  = 3

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewBinding]
}

object NewBlock {
  def apply(): NewBlock = new NewBlock
}

class NewBlock extends NewNode with BlockBase with ExpressionNew {
  type StoredType = Block

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var argumentName: Option[String]                = None
  var argumentIndex: scala.Int                    = -1: Int

  override def label: String = "BLOCK"

  override def copy: this.type = {
    val newInstance = new NewBlock
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.lineNumber
      case 3 => this.dynamicTypeHintFullName
      case 4 => this.columnNumber
      case 5 => this.code
      case 6 => this.argumentName
      case 7 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "lineNumber"
      case 3 => "dynamicTypeHintFullName"
      case 4 => "columnNumber"
      case 5 => "code"
      case 6 => "argumentName"
      case 7 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewBlock"
  override def productArity  = 8

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewBlock]
}

object NewCall {
  def apply(): NewCall = new NewCall
}

class NewCall extends NewNode with CallBase with CallReprNew with ExpressionNew {
  type StoredType = Call

  var typeFullName: String                        = "<empty>"
  var signature: String                           = ""
  var order: scala.Int                            = -1: Int
  var name: String                                = "<empty>"
  var methodFullName: String                      = "<empty>"
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var dispatchType: String                        = "<empty>"
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var argumentName: Option[String]                = None
  var argumentIndex: scala.Int                    = -1: Int

  override def label: String = "CALL"

  override def copy: this.type = {
    val newInstance = new NewCall
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dispatchType = this.dispatchType
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.methodFullName = this.methodFullName
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.signature = this.signature
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dispatchType(value: String): this.type = {
    this.dispatchType = value
    this
  }

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def methodFullName(value: String): this.type = {
    this.methodFullName = value
    this
  }

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def signature(value: String): this.type = {
    this.signature = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == dispatchType)) { res += "DISPATCH_TYPE" -> dispatchType }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == methodFullName)) { res += "METHOD_FULL_NAME" -> methodFullName }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("") == signature)) { res += "SIGNATURE" -> signature }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0  => this.typeFullName
      case 1  => this.signature
      case 2  => this.order
      case 3  => this.name
      case 4  => this.methodFullName
      case 5  => this.lineNumber
      case 6  => this.dynamicTypeHintFullName
      case 7  => this.dispatchType
      case 8  => this.columnNumber
      case 9  => this.code
      case 10 => this.argumentName
      case 11 => this.argumentIndex
      case _  => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "typeFullName"
      case 1  => "signature"
      case 2  => "order"
      case 3  => "name"
      case 4  => "methodFullName"
      case 5  => "lineNumber"
      case 6  => "dynamicTypeHintFullName"
      case 7  => "dispatchType"
      case 8  => "columnNumber"
      case 9  => "code"
      case 10 => "argumentName"
      case 11 => "argumentIndex"
      case _  => ""
    }

  override def productPrefix = "NewCall"
  override def productArity  = 12

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewCall]
}

object NewClosureBinding {
  def apply(): NewClosureBinding = new NewClosureBinding
}

class NewClosureBinding extends NewNode with ClosureBindingBase {
  type StoredType = ClosureBinding

  var evaluationStrategy: String          = "<empty>"
  var closureOriginalName: Option[String] = None
  var closureBindingId: Option[String]    = None

  override def label: String = "CLOSURE_BINDING"

  override def copy: this.type = {
    val newInstance = new NewClosureBinding
    newInstance.closureBindingId = this.closureBindingId
    newInstance.closureOriginalName = this.closureOriginalName
    newInstance.evaluationStrategy = this.evaluationStrategy
    newInstance.asInstanceOf[this.type]
  }

  def closureBindingId(value: String): this.type = {
    this.closureBindingId = Option(value)
    this
  }

  def closureBindingId(value: Option[String]): this.type = closureBindingId(value.orNull)

  def closureOriginalName(value: String): this.type = {
    this.closureOriginalName = Option(value)
    this
  }

  def closureOriginalName(value: Option[String]): this.type = closureOriginalName(value.orNull)

  def evaluationStrategy(value: String): this.type = {
    this.evaluationStrategy = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    closureBindingId.map { value => res += "CLOSURE_BINDING_ID" -> value }
    closureOriginalName.map { value => res += "CLOSURE_ORIGINAL_NAME" -> value }
    if (!(("<empty>") == evaluationStrategy)) { res += "EVALUATION_STRATEGY" -> evaluationStrategy }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.evaluationStrategy
      case 1 => this.closureOriginalName
      case 2 => this.closureBindingId
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "evaluationStrategy"
      case 1 => "closureOriginalName"
      case 2 => "closureBindingId"
      case _ => ""
    }

  override def productPrefix = "NewClosureBinding"
  override def productArity  = 3

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewClosureBinding]
}

object NewComment {
  def apply(): NewComment = new NewComment
}

class NewComment extends NewNode with CommentBase with AstNodeNew {
  type StoredType = Comment

  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var filename: String              = "<empty>"
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "COMMENT"

  override def copy: this.type = {
    val newInstance = new NewComment
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.filename = this.filename
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def filename(value: String): this.type = {
    this.filename = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == filename)) { res += "FILENAME" -> filename }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.filename
      case 3 => this.columnNumber
      case 4 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "filename"
      case 3 => "columnNumber"
      case 4 => "code"
      case _ => ""
    }

  override def productPrefix = "NewComment"
  override def productArity  = 5

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewComment]
}

object NewConfigFile {
  def apply(): NewConfigFile = new NewConfigFile
}

class NewConfigFile extends NewNode with ConfigFileBase {
  type StoredType = ConfigFile

  var name: String    = "<empty>"
  var content: String = "<empty>"

  override def label: String = "CONFIG_FILE"

  override def copy: this.type = {
    val newInstance = new NewConfigFile
    newInstance.content = this.content
    newInstance.name = this.name
    newInstance.asInstanceOf[this.type]
  }

  def content(value: String): this.type = {
    this.content = value
    this
  }

  def name(value: String): this.type = {
    this.name = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == content)) { res += "CONTENT" -> content }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.name
      case 1 => this.content
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "name"
      case 1 => "content"
      case _ => ""
    }

  override def productPrefix = "NewConfigFile"
  override def productArity  = 2

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewConfigFile]
}

object NewControlStructure {
  def apply(): NewControlStructure = new NewControlStructure
}

class NewControlStructure extends NewNode with ControlStructureBase with ExpressionNew {
  type StoredType = ControlStructure

  var parserTypeName: String        = "<empty>"
  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var controlStructureType: String  = "<empty>"
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var argumentName: Option[String]  = None
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "CONTROL_STRUCTURE"

  override def copy: this.type = {
    val newInstance = new NewControlStructure
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.controlStructureType = this.controlStructureType
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.parserTypeName = this.parserTypeName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def controlStructureType(value: String): this.type = {
    this.controlStructureType = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def parserTypeName(value: String): this.type = {
    this.parserTypeName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == controlStructureType)) { res += "CONTROL_STRUCTURE_TYPE" -> controlStructureType }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == parserTypeName)) { res += "PARSER_TYPE_NAME" -> parserTypeName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.parserTypeName
      case 1 => this.order
      case 2 => this.lineNumber
      case 3 => this.controlStructureType
      case 4 => this.columnNumber
      case 5 => this.code
      case 6 => this.argumentName
      case 7 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "parserTypeName"
      case 1 => "order"
      case 2 => "lineNumber"
      case 3 => "controlStructureType"
      case 4 => "columnNumber"
      case 5 => "code"
      case 6 => "argumentName"
      case 7 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewControlStructure"
  override def productArity  = 8

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewControlStructure]
}

object NewDependency {
  def apply(): NewDependency = new NewDependency
}

class NewDependency extends NewNode with DependencyBase {
  type StoredType = Dependency

  var version: String                   = "<empty>"
  var name: String                      = "<empty>"
  var dependencyGroupId: Option[String] = None

  override def label: String = "DEPENDENCY"

  override def copy: this.type = {
    val newInstance = new NewDependency
    newInstance.dependencyGroupId = this.dependencyGroupId
    newInstance.name = this.name
    newInstance.version = this.version
    newInstance.asInstanceOf[this.type]
  }

  def dependencyGroupId(value: String): this.type = {
    this.dependencyGroupId = Option(value)
    this
  }

  def dependencyGroupId(value: Option[String]): this.type = dependencyGroupId(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def version(value: String): this.type = {
    this.version = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    dependencyGroupId.map { value => res += "DEPENDENCY_GROUP_ID" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!(("<empty>") == version)) { res += "VERSION" -> version }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.version
      case 1 => this.name
      case 2 => this.dependencyGroupId
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "version"
      case 1 => "name"
      case 2 => "dependencyGroupId"
      case _ => ""
    }

  override def productPrefix = "NewDependency"
  override def productArity  = 3

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewDependency]
}

object NewFieldIdentifier {
  def apply(): NewFieldIdentifier = new NewFieldIdentifier
}

class NewFieldIdentifier extends NewNode with FieldIdentifierBase with ExpressionNew {
  type StoredType = FieldIdentifier

  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var canonicalName: String         = "<empty>"
  var argumentName: Option[String]  = None
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "FIELD_IDENTIFIER"

  override def copy: this.type = {
    val newInstance = new NewFieldIdentifier
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.canonicalName = this.canonicalName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def canonicalName(value: String): this.type = {
    this.canonicalName = value
    this
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == canonicalName)) { res += "CANONICAL_NAME" -> canonicalName }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.columnNumber
      case 3 => this.code
      case 4 => this.canonicalName
      case 5 => this.argumentName
      case 6 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "columnNumber"
      case 3 => "code"
      case 4 => "canonicalName"
      case 5 => "argumentName"
      case 6 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewFieldIdentifier"
  override def productArity  = 7

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewFieldIdentifier]
}

object NewFile {
  def apply(): NewFile = new NewFile
}

class NewFile extends NewNode with FileBase with AstNodeNew {
  type StoredType = File

  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var hash: Option[String]          = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "FILE"

  override def copy: this.type = {
    val newInstance = new NewFile
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.hash = this.hash
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def hash(value: String): this.type = {
    this.hash = Option(value)
    this
  }

  def hash(value: Option[String]): this.type = hash(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    hash.map { value => res += "HASH" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.name
      case 2 => this.lineNumber
      case 3 => this.hash
      case 4 => this.columnNumber
      case 5 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "name"
      case 2 => "lineNumber"
      case 3 => "hash"
      case 4 => "columnNumber"
      case 5 => "code"
      case _ => ""
    }

  override def productPrefix = "NewFile"
  override def productArity  = 6

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewFile]
}

object NewFinding {
  def apply(): NewFinding = new NewFinding
}

class NewFinding extends NewNode with FindingBase {
  type StoredType = Finding

  var keyValuePairs: IndexedSeq[KeyValuePairBase] = collection.immutable.ArraySeq.empty
  var evidence: IndexedSeq[AbstractNode]          = collection.immutable.ArraySeq.empty

  override def label: String = "FINDING"

  override def copy: this.type = {
    val newInstance = new NewFinding
    newInstance.evidence = this.evidence
    newInstance.keyValuePairs = this.keyValuePairs
    newInstance.asInstanceOf[this.type]
  }

  def evidence(value: IterableOnce[AbstractNode]): this.type = {
    this.evidence = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def keyValuePairs(value: IterableOnce[KeyValuePairBase]): this.type = {
    this.keyValuePairs = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (evidence != null && evidence.nonEmpty) { res += "evidence" -> evidence }
    if (keyValuePairs != null && keyValuePairs.nonEmpty) { res += "keyValuePairs" -> keyValuePairs }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.keyValuePairs
      case 1 => this.evidence
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "keyValuePairs"
      case 1 => "evidence"
      case _ => ""
    }

  override def productPrefix = "NewFinding"
  override def productArity  = 2

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewFinding]
}

object NewIdentifier {
  def apply(): NewIdentifier = new NewIdentifier
}

class NewIdentifier extends NewNode with IdentifierBase with ExpressionNew {
  type StoredType = Identifier

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var name: String                                = "<empty>"
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var argumentName: Option[String]                = None
  var argumentIndex: scala.Int                    = -1: Int

  override def label: String = "IDENTIFIER"

  override def copy: this.type = {
    val newInstance = new NewIdentifier
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.name
      case 3 => this.lineNumber
      case 4 => this.dynamicTypeHintFullName
      case 5 => this.columnNumber
      case 6 => this.code
      case 7 => this.argumentName
      case 8 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "name"
      case 3 => "lineNumber"
      case 4 => "dynamicTypeHintFullName"
      case 5 => "columnNumber"
      case 6 => "code"
      case 7 => "argumentName"
      case 8 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewIdentifier"
  override def productArity  = 9

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewIdentifier]
}

object NewImport {
  def apply(): NewImport = new NewImport
}

class NewImport extends NewNode with ImportBase with AstNodeNew {
  type StoredType = Import

  var order: scala.Int                      = -1: Int
  var lineNumber: Option[Integer]           = None
  var isWildcard: Option[java.lang.Boolean] = None
  var isExplicit: Option[java.lang.Boolean] = None
  var importedEntity: Option[String]        = None
  var importedAs: Option[String]            = None
  var explicitAs: Option[java.lang.Boolean] = None
  var columnNumber: Option[Integer]         = None
  var code: String                          = "<empty>"

  override def label: String = "IMPORT"

  override def copy: this.type = {
    val newInstance = new NewImport
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.explicitAs = this.explicitAs
    newInstance.importedAs = this.importedAs
    newInstance.importedEntity = this.importedEntity
    newInstance.isExplicit = this.isExplicit
    newInstance.isWildcard = this.isWildcard
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def explicitAs(value: java.lang.Boolean): this.type = {
    this.explicitAs = Option(value)
    this
  }

  def explicitAs(value: Option[java.lang.Boolean]): this.type = explicitAs(value.orNull)

  def importedAs(value: String): this.type = {
    this.importedAs = Option(value)
    this
  }

  def importedAs(value: Option[String]): this.type = importedAs(value.orNull)

  def importedEntity(value: String): this.type = {
    this.importedEntity = Option(value)
    this
  }

  def importedEntity(value: Option[String]): this.type = importedEntity(value.orNull)

  def isExplicit(value: java.lang.Boolean): this.type = {
    this.isExplicit = Option(value)
    this
  }

  def isExplicit(value: Option[java.lang.Boolean]): this.type = isExplicit(value.orNull)

  def isWildcard(value: java.lang.Boolean): this.type = {
    this.isWildcard = Option(value)
    this
  }

  def isWildcard(value: Option[java.lang.Boolean]): this.type = isWildcard(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    explicitAs.map { value => res += "EXPLICIT_AS" -> value }
    importedAs.map { value => res += "IMPORTED_AS" -> value }
    importedEntity.map { value => res += "IMPORTED_ENTITY" -> value }
    isExplicit.map { value => res += "IS_EXPLICIT" -> value }
    isWildcard.map { value => res += "IS_WILDCARD" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.isWildcard
      case 3 => this.isExplicit
      case 4 => this.importedEntity
      case 5 => this.importedAs
      case 6 => this.explicitAs
      case 7 => this.columnNumber
      case 8 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "isWildcard"
      case 3 => "isExplicit"
      case 4 => "importedEntity"
      case 5 => "importedAs"
      case 6 => "explicitAs"
      case 7 => "columnNumber"
      case 8 => "code"
      case _ => ""
    }

  override def productPrefix = "NewImport"
  override def productArity  = 9

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewImport]
}

object NewJumpLabel {
  def apply(): NewJumpLabel = new NewJumpLabel
}

class NewJumpLabel extends NewNode with JumpLabelBase with AstNodeNew {
  type StoredType = JumpLabel

  var parserTypeName: String        = "<empty>"
  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "JUMP_LABEL"

  override def copy: this.type = {
    val newInstance = new NewJumpLabel
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.parserTypeName = this.parserTypeName
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def parserTypeName(value: String): this.type = {
    this.parserTypeName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == parserTypeName)) { res += "PARSER_TYPE_NAME" -> parserTypeName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.parserTypeName
      case 1 => this.order
      case 2 => this.name
      case 3 => this.lineNumber
      case 4 => this.columnNumber
      case 5 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "parserTypeName"
      case 1 => "order"
      case 2 => "name"
      case 3 => "lineNumber"
      case 4 => "columnNumber"
      case 5 => "code"
      case _ => ""
    }

  override def productPrefix = "NewJumpLabel"
  override def productArity  = 6

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewJumpLabel]
}

object NewJumpTarget {
  def apply(): NewJumpTarget = new NewJumpTarget
}

class NewJumpTarget extends NewNode with JumpTargetBase with AstNodeNew with CfgNodeNew {
  type StoredType = JumpTarget

  var parserTypeName: String        = "<empty>"
  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "JUMP_TARGET"

  override def copy: this.type = {
    val newInstance = new NewJumpTarget
    newInstance.argumentIndex = this.argumentIndex
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.parserTypeName = this.parserTypeName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def parserTypeName(value: String): this.type = {
    this.parserTypeName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == parserTypeName)) { res += "PARSER_TYPE_NAME" -> parserTypeName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.parserTypeName
      case 1 => this.order
      case 2 => this.name
      case 3 => this.lineNumber
      case 4 => this.columnNumber
      case 5 => this.code
      case 6 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "parserTypeName"
      case 1 => "order"
      case 2 => "name"
      case 3 => "lineNumber"
      case 4 => "columnNumber"
      case 5 => "code"
      case 6 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewJumpTarget"
  override def productArity  = 7

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewJumpTarget]
}

object NewKeyValuePair {
  def apply(): NewKeyValuePair = new NewKeyValuePair
}

class NewKeyValuePair extends NewNode with KeyValuePairBase {
  type StoredType = KeyValuePair

  var value: String = ""
  var key: String   = "<empty>"

  override def label: String = "KEY_VALUE_PAIR"

  override def copy: this.type = {
    val newInstance = new NewKeyValuePair
    newInstance.key = this.key
    newInstance.value = this.value
    newInstance.asInstanceOf[this.type]
  }

  def key(value: String): this.type = {
    this.key = value
    this
  }

  def value(value: String): this.type = {
    this.value = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == key)) { res += "KEY" -> key }
    if (!(("") == value)) { res += "VALUE" -> value }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.value
      case 1 => this.key
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "value"
      case 1 => "key"
      case _ => ""
    }

  override def productPrefix = "NewKeyValuePair"
  override def productArity  = 2

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewKeyValuePair]
}

object NewLiteral {
  def apply(): NewLiteral = new NewLiteral
}

class NewLiteral extends NewNode with LiteralBase with ExpressionNew {
  type StoredType = Literal

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var argumentName: Option[String]                = None
  var argumentIndex: scala.Int                    = -1: Int

  override def label: String = "LITERAL"

  override def copy: this.type = {
    val newInstance = new NewLiteral
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.lineNumber
      case 3 => this.dynamicTypeHintFullName
      case 4 => this.columnNumber
      case 5 => this.code
      case 6 => this.argumentName
      case 7 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "lineNumber"
      case 3 => "dynamicTypeHintFullName"
      case 4 => "columnNumber"
      case 5 => "code"
      case 6 => "argumentName"
      case 7 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewLiteral"
  override def productArity  = 8

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewLiteral]
}

object NewLocal {
  def apply(): NewLocal = new NewLocal
}

class NewLocal extends NewNode with LocalBase with AstNodeNew with DeclarationNew {
  type StoredType = Local

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var name: String                                = "<empty>"
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var closureBindingId: Option[String]            = None

  override def label: String = "LOCAL"

  override def copy: this.type = {
    val newInstance = new NewLocal
    newInstance.closureBindingId = this.closureBindingId
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def closureBindingId(value: String): this.type = {
    this.closureBindingId = Option(value)
    this
  }

  def closureBindingId(value: Option[String]): this.type = closureBindingId(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    closureBindingId.map { value => res += "CLOSURE_BINDING_ID" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.name
      case 3 => this.lineNumber
      case 4 => this.dynamicTypeHintFullName
      case 5 => this.columnNumber
      case 6 => this.code
      case 7 => this.closureBindingId
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "name"
      case 3 => "lineNumber"
      case 4 => "dynamicTypeHintFullName"
      case 5 => "columnNumber"
      case 6 => "code"
      case 7 => "closureBindingId"
      case _ => ""
    }

  override def productPrefix = "NewLocal"
  override def productArity  = 8

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewLocal]
}

object NewLocation {
  def apply(): NewLocation = new NewLocation
}

class NewLocation extends NewNode with LocationBase {
  type StoredType = Location

  var node: Option[AbstractNode]  = None
  var symbol: String              = "<empty>"
  var packageName: String         = "<empty>"
  var nodeLabel: String           = "<empty>"
  var methodShortName: String     = "<empty>"
  var methodFullName: String      = "<empty>"
  var lineNumber: Option[Integer] = None
  var filename: String            = "<empty>"
  var classShortName: String      = "<empty>"
  var className: String           = "<empty>"

  override def label: String = "LOCATION"

  override def copy: this.type = {
    val newInstance = new NewLocation
    newInstance.className = this.className
    newInstance.classShortName = this.classShortName
    newInstance.filename = this.filename
    newInstance.lineNumber = this.lineNumber
    newInstance.methodFullName = this.methodFullName
    newInstance.methodShortName = this.methodShortName
    newInstance.nodeLabel = this.nodeLabel
    newInstance.packageName = this.packageName
    newInstance.symbol = this.symbol
    newInstance.node = this.node
    newInstance.asInstanceOf[this.type]
  }

  def className(value: String): this.type = {
    this.className = value
    this
  }

  def classShortName(value: String): this.type = {
    this.classShortName = value
    this
  }

  def filename(value: String): this.type = {
    this.filename = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def methodFullName(value: String): this.type = {
    this.methodFullName = value
    this
  }

  def methodShortName(value: String): this.type = {
    this.methodShortName = value
    this
  }

  def nodeLabel(value: String): this.type = {
    this.nodeLabel = value
    this
  }

  def packageName(value: String): this.type = {
    this.packageName = value
    this
  }

  def symbol(value: String): this.type = {
    this.symbol = value
    this
  }

  def node(value: AbstractNode): this.type = {
    this.node = Option(value)
    this
  }

  def node(value: Option[AbstractNode]): this.type = node(value.orNull)

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == className)) { res += "CLASS_NAME" -> className }
    if (!(("<empty>") == classShortName)) { res += "CLASS_SHORT_NAME" -> classShortName }
    if (!(("<empty>") == filename)) { res += "FILENAME" -> filename }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == methodFullName)) { res += "METHOD_FULL_NAME" -> methodFullName }
    if (!(("<empty>") == methodShortName)) { res += "METHOD_SHORT_NAME" -> methodShortName }
    if (!(("<empty>") == nodeLabel)) { res += "NODE_LABEL" -> nodeLabel }
    if (!(("<empty>") == packageName)) { res += "PACKAGE_NAME" -> packageName }
    if (!(("<empty>") == symbol)) { res += "SYMBOL" -> symbol }
    node.map { value => res += "node" -> value }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.node
      case 1 => this.symbol
      case 2 => this.packageName
      case 3 => this.nodeLabel
      case 4 => this.methodShortName
      case 5 => this.methodFullName
      case 6 => this.lineNumber
      case 7 => this.filename
      case 8 => this.classShortName
      case 9 => this.className
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "node"
      case 1 => "symbol"
      case 2 => "packageName"
      case 3 => "nodeLabel"
      case 4 => "methodShortName"
      case 5 => "methodFullName"
      case 6 => "lineNumber"
      case 7 => "filename"
      case 8 => "classShortName"
      case 9 => "className"
      case _ => ""
    }

  override def productPrefix = "NewLocation"
  override def productArity  = 10

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewLocation]
}

object NewMember {
  def apply(): NewMember = new NewMember
}

class NewMember extends NewNode with MemberBase with AstNodeNew with DeclarationNew {
  type StoredType = Member

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var name: String                                = "<empty>"
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"

  override def label: String = "MEMBER"

  override def copy: this.type = {
    val newInstance = new NewMember
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.name
      case 3 => this.lineNumber
      case 4 => this.dynamicTypeHintFullName
      case 5 => this.columnNumber
      case 6 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "name"
      case 3 => "lineNumber"
      case 4 => "dynamicTypeHintFullName"
      case 5 => "columnNumber"
      case 6 => "code"
      case _ => ""
    }

  override def productPrefix = "NewMember"
  override def productArity  = 7

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMember]
}

object NewMetaData {
  def apply(): NewMetaData = new NewMetaData
}

class NewMetaData extends NewNode with MetaDataBase {
  type StoredType = MetaData

  var version: String              = "<empty>"
  var root: String                 = "<empty>"
  var overlays: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var language: String             = "<empty>"
  var hash: Option[String]         = None

  override def label: String = "META_DATA"

  override def copy: this.type = {
    val newInstance = new NewMetaData
    newInstance.hash = this.hash
    newInstance.language = this.language
    newInstance.overlays = this.overlays
    newInstance.root = this.root
    newInstance.version = this.version
    newInstance.asInstanceOf[this.type]
  }

  def hash(value: String): this.type = {
    this.hash = Option(value)
    this
  }

  def hash(value: Option[String]): this.type = hash(value.orNull)

  def language(value: String): this.type = {
    this.language = value
    this
  }

  def overlays(value: IterableOnce[String]): this.type = {
    this.overlays = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def root(value: String): this.type = {
    this.root = value
    this
  }

  def version(value: String): this.type = {
    this.version = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    hash.map { value => res += "HASH" -> value }
    if (!(("<empty>") == language)) { res += "LANGUAGE" -> language }
    if (overlays != null && overlays.nonEmpty) { res += "OVERLAYS" -> overlays }
    if (!(("<empty>") == root)) { res += "ROOT" -> root }
    if (!(("<empty>") == version)) { res += "VERSION" -> version }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.version
      case 1 => this.root
      case 2 => this.overlays
      case 3 => this.language
      case 4 => this.hash
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "version"
      case 1 => "root"
      case 2 => "overlays"
      case 3 => "language"
      case 4 => "hash"
      case _ => ""
    }

  override def productPrefix = "NewMetaData"
  override def productArity  = 5

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMetaData]
}

object NewMethod {
  def apply(): NewMethod = new NewMethod
}

class NewMethod extends NewNode with MethodBase with AstNodeNew with CfgNodeNew with DeclarationNew {
  type StoredType = Method

  var signature: String                = ""
  var order: scala.Int                 = -1: Int
  var name: String                     = "<empty>"
  var lineNumberEnd: Option[Integer]   = None
  var lineNumber: Option[Integer]      = None
  var isExternal: Boolean              = false
  var hash: Option[String]             = None
  var fullName: String                 = "<empty>"
  var filename: String                 = "<empty>"
  var columnNumberEnd: Option[Integer] = None
  var columnNumber: Option[Integer]    = None
  var code: String                     = "<empty>"
  var astParentType: String            = "<empty>"
  var astParentFullName: String        = "<empty>"

  override def label: String = "METHOD"

  override def copy: this.type = {
    val newInstance = new NewMethod
    newInstance.astParentFullName = this.astParentFullName
    newInstance.astParentType = this.astParentType
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.columnNumberEnd = this.columnNumberEnd
    newInstance.filename = this.filename
    newInstance.fullName = this.fullName
    newInstance.hash = this.hash
    newInstance.isExternal = this.isExternal
    newInstance.lineNumber = this.lineNumber
    newInstance.lineNumberEnd = this.lineNumberEnd
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.signature = this.signature
    newInstance.asInstanceOf[this.type]
  }

  def astParentFullName(value: String): this.type = {
    this.astParentFullName = value
    this
  }

  def astParentType(value: String): this.type = {
    this.astParentType = value
    this
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def columnNumberEnd(value: Integer): this.type = {
    this.columnNumberEnd = Option(value)
    this
  }

  def columnNumberEnd(value: Option[Integer]): this.type = columnNumberEnd(value.orNull)

  def filename(value: String): this.type = {
    this.filename = value
    this
  }

  def fullName(value: String): this.type = {
    this.fullName = value
    this
  }

  def hash(value: String): this.type = {
    this.hash = Option(value)
    this
  }

  def hash(value: Option[String]): this.type = hash(value.orNull)

  def isExternal(value: Boolean): this.type = {
    this.isExternal = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def lineNumberEnd(value: Integer): this.type = {
    this.lineNumberEnd = Option(value)
    this
  }

  def lineNumberEnd(value: Option[Integer]): this.type = lineNumberEnd(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def signature(value: String): this.type = {
    this.signature = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == astParentFullName)) { res += "AST_PARENT_FULL_NAME" -> astParentFullName }
    if (!(("<empty>") == astParentType)) { res += "AST_PARENT_TYPE" -> astParentType }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    columnNumberEnd.map { value => res += "COLUMN_NUMBER_END" -> value }
    if (!(("<empty>") == filename)) { res += "FILENAME" -> filename }
    if (!(("<empty>") == fullName)) { res += "FULL_NAME" -> fullName }
    hash.map { value => res += "HASH" -> value }
    if (!((false) == isExternal)) { res += "IS_EXTERNAL" -> isExternal }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    lineNumberEnd.map { value => res += "LINE_NUMBER_END" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("") == signature)) { res += "SIGNATURE" -> signature }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0  => this.signature
      case 1  => this.order
      case 2  => this.name
      case 3  => this.lineNumberEnd
      case 4  => this.lineNumber
      case 5  => this.isExternal
      case 6  => this.hash
      case 7  => this.fullName
      case 8  => this.filename
      case 9  => this.columnNumberEnd
      case 10 => this.columnNumber
      case 11 => this.code
      case 12 => this.astParentType
      case 13 => this.astParentFullName
      case _  => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "signature"
      case 1  => "order"
      case 2  => "name"
      case 3  => "lineNumberEnd"
      case 4  => "lineNumber"
      case 5  => "isExternal"
      case 6  => "hash"
      case 7  => "fullName"
      case 8  => "filename"
      case 9  => "columnNumberEnd"
      case 10 => "columnNumber"
      case 11 => "code"
      case 12 => "astParentType"
      case 13 => "astParentFullName"
      case _  => ""
    }

  override def productPrefix = "NewMethod"
  override def productArity  = 14

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMethod]
}

object NewMethodParameterIn {
  def apply(): NewMethodParameterIn = new NewMethodParameterIn
}

class NewMethodParameterIn
    extends NewNode
    with MethodParameterInBase
    with AstNodeNew
    with CfgNodeNew
    with DeclarationNew {
  type StoredType = MethodParameterIn

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var name: String                                = "<empty>"
  var lineNumber: Option[Integer]                 = None
  var isVariadic: Boolean                         = false
  var index: scala.Int                            = -1: Int
  var evaluationStrategy: String                  = "<empty>"
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"

  override def label: String = "METHOD_PARAMETER_IN"

  override def copy: this.type = {
    val newInstance = new NewMethodParameterIn
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.evaluationStrategy = this.evaluationStrategy
    newInstance.index = this.index
    newInstance.isVariadic = this.isVariadic
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def evaluationStrategy(value: String): this.type = {
    this.evaluationStrategy = value
    this
  }

  def index(value: scala.Int): this.type = {
    this.index = value
    this
  }

  def isVariadic(value: Boolean): this.type = {
    this.isVariadic = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    if (!(("<empty>") == evaluationStrategy)) { res += "EVALUATION_STRATEGY" -> evaluationStrategy }
    if (!((-1: Int) == index)) { res += "INDEX" -> index }
    if (!((false) == isVariadic)) { res += "IS_VARIADIC" -> isVariadic }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.name
      case 3 => this.lineNumber
      case 4 => this.isVariadic
      case 5 => this.index
      case 6 => this.evaluationStrategy
      case 7 => this.dynamicTypeHintFullName
      case 8 => this.columnNumber
      case 9 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "name"
      case 3 => "lineNumber"
      case 4 => "isVariadic"
      case 5 => "index"
      case 6 => "evaluationStrategy"
      case 7 => "dynamicTypeHintFullName"
      case 8 => "columnNumber"
      case 9 => "code"
      case _ => ""
    }

  override def productPrefix = "NewMethodParameterIn"
  override def productArity  = 10

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMethodParameterIn]
}

object NewMethodParameterOut {
  def apply(): NewMethodParameterOut = new NewMethodParameterOut
}

class NewMethodParameterOut
    extends NewNode
    with MethodParameterOutBase
    with AstNodeNew
    with CfgNodeNew
    with DeclarationNew {
  type StoredType = MethodParameterOut

  var typeFullName: String          = "<empty>"
  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var isVariadic: Boolean           = false
  var index: scala.Int              = -1: Int
  var evaluationStrategy: String    = "<empty>"
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "METHOD_PARAMETER_OUT"

  override def copy: this.type = {
    val newInstance = new NewMethodParameterOut
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.evaluationStrategy = this.evaluationStrategy
    newInstance.index = this.index
    newInstance.isVariadic = this.isVariadic
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def evaluationStrategy(value: String): this.type = {
    this.evaluationStrategy = value
    this
  }

  def index(value: scala.Int): this.type = {
    this.index = value
    this
  }

  def isVariadic(value: Boolean): this.type = {
    this.isVariadic = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == evaluationStrategy)) { res += "EVALUATION_STRATEGY" -> evaluationStrategy }
    if (!((-1: Int) == index)) { res += "INDEX" -> index }
    if (!((false) == isVariadic)) { res += "IS_VARIADIC" -> isVariadic }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.name
      case 3 => this.lineNumber
      case 4 => this.isVariadic
      case 5 => this.index
      case 6 => this.evaluationStrategy
      case 7 => this.columnNumber
      case 8 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "name"
      case 3 => "lineNumber"
      case 4 => "isVariadic"
      case 5 => "index"
      case 6 => "evaluationStrategy"
      case 7 => "columnNumber"
      case 8 => "code"
      case _ => ""
    }

  override def productPrefix = "NewMethodParameterOut"
  override def productArity  = 9

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMethodParameterOut]
}

object NewMethodRef {
  def apply(): NewMethodRef = new NewMethodRef
}

class NewMethodRef extends NewNode with MethodRefBase with ExpressionNew {
  type StoredType = MethodRef

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var methodFullName: String                      = "<empty>"
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var argumentName: Option[String]                = None
  var argumentIndex: scala.Int                    = -1: Int

  override def label: String = "METHOD_REF"

  override def copy: this.type = {
    val newInstance = new NewMethodRef
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.methodFullName = this.methodFullName
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def methodFullName(value: String): this.type = {
    this.methodFullName = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == methodFullName)) { res += "METHOD_FULL_NAME" -> methodFullName }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.methodFullName
      case 3 => this.lineNumber
      case 4 => this.dynamicTypeHintFullName
      case 5 => this.columnNumber
      case 6 => this.code
      case 7 => this.argumentName
      case 8 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "methodFullName"
      case 3 => "lineNumber"
      case 4 => "dynamicTypeHintFullName"
      case 5 => "columnNumber"
      case 6 => "code"
      case 7 => "argumentName"
      case 8 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewMethodRef"
  override def productArity  = 9

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMethodRef]
}

object NewMethodReturn {
  def apply(): NewMethodReturn = new NewMethodReturn
}

class NewMethodReturn extends NewNode with MethodReturnBase with CfgNodeNew {
  type StoredType = MethodReturn

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var lineNumber: Option[Integer]                 = None
  var evaluationStrategy: String                  = "<empty>"
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"

  override def label: String = "METHOD_RETURN"

  override def copy: this.type = {
    val newInstance = new NewMethodReturn
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.evaluationStrategy = this.evaluationStrategy
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def evaluationStrategy(value: String): this.type = {
    this.evaluationStrategy = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    if (!(("<empty>") == evaluationStrategy)) { res += "EVALUATION_STRATEGY" -> evaluationStrategy }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.lineNumber
      case 3 => this.evaluationStrategy
      case 4 => this.dynamicTypeHintFullName
      case 5 => this.columnNumber
      case 6 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "lineNumber"
      case 3 => "evaluationStrategy"
      case 4 => "dynamicTypeHintFullName"
      case 5 => "columnNumber"
      case 6 => "code"
      case _ => ""
    }

  override def productPrefix = "NewMethodReturn"
  override def productArity  = 7

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMethodReturn]
}

object NewModifier {
  def apply(): NewModifier = new NewModifier
}

class NewModifier extends NewNode with ModifierBase with AstNodeNew {
  type StoredType = Modifier

  var order: scala.Int              = -1: Int
  var modifierType: String          = "<empty>"
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "MODIFIER"

  override def copy: this.type = {
    val newInstance = new NewModifier
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.modifierType = this.modifierType
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def modifierType(value: String): this.type = {
    this.modifierType = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == modifierType)) { res += "MODIFIER_TYPE" -> modifierType }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.modifierType
      case 2 => this.lineNumber
      case 3 => this.columnNumber
      case 4 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "modifierType"
      case 2 => "lineNumber"
      case 3 => "columnNumber"
      case 4 => "code"
      case _ => ""
    }

  override def productPrefix = "NewModifier"
  override def productArity  = 5

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewModifier]
}

object NewMynodetype {
  def apply(): NewMynodetype = new NewMynodetype
}

class NewMynodetype extends NewNode with MynodetypeBase {
  type StoredType = Mynodetype

  var myproperty: String = ""

  override def label: String = "MYNODETYPE"

  override def copy: this.type = {
    val newInstance = new NewMynodetype
    newInstance.myproperty = this.myproperty
    newInstance.asInstanceOf[this.type]
  }

  def myproperty(value: String): this.type = {
    this.myproperty = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("") == myproperty)) { res += "MYPROPERTY" -> myproperty }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.myproperty
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "myproperty"
      case _ => ""
    }

  override def productPrefix = "NewMynodetype"
  override def productArity  = 1

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMynodetype]
}

object NewNamespace {
  def apply(): NewNamespace = new NewNamespace
}

class NewNamespace extends NewNode with NamespaceBase with AstNodeNew {
  type StoredType = Namespace

  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "NAMESPACE"

  override def copy: this.type = {
    val newInstance = new NewNamespace
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.name
      case 2 => this.lineNumber
      case 3 => this.columnNumber
      case 4 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "name"
      case 2 => "lineNumber"
      case 3 => "columnNumber"
      case 4 => "code"
      case _ => ""
    }

  override def productPrefix = "NewNamespace"
  override def productArity  = 5

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewNamespace]
}

object NewNamespaceBlock {
  def apply(): NewNamespaceBlock = new NewNamespaceBlock
}

class NewNamespaceBlock extends NewNode with NamespaceBlockBase with AstNodeNew {
  type StoredType = NamespaceBlock

  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var fullName: String              = "<empty>"
  var filename: String              = "<empty>"
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "NAMESPACE_BLOCK"

  override def copy: this.type = {
    val newInstance = new NewNamespaceBlock
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.filename = this.filename
    newInstance.fullName = this.fullName
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def filename(value: String): this.type = {
    this.filename = value
    this
  }

  def fullName(value: String): this.type = {
    this.fullName = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == filename)) { res += "FILENAME" -> filename }
    if (!(("<empty>") == fullName)) { res += "FULL_NAME" -> fullName }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.name
      case 2 => this.lineNumber
      case 3 => this.fullName
      case 4 => this.filename
      case 5 => this.columnNumber
      case 6 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "name"
      case 2 => "lineNumber"
      case 3 => "fullName"
      case 4 => "filename"
      case 5 => "columnNumber"
      case 6 => "code"
      case _ => ""
    }

  override def productPrefix = "NewNamespaceBlock"
  override def productArity  = 7

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewNamespaceBlock]
}

object NewReturn {
  def apply(): NewReturn = new NewReturn
}

class NewReturn extends NewNode with ReturnBase with ExpressionNew {
  type StoredType = Return

  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var argumentName: Option[String]  = None
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "RETURN"

  override def copy: this.type = {
    val newInstance = new NewReturn
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.columnNumber
      case 3 => this.code
      case 4 => this.argumentName
      case 5 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "columnNumber"
      case 3 => "code"
      case 4 => "argumentName"
      case 5 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewReturn"
  override def productArity  = 6

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewReturn]
}

object NewTag {
  def apply(): NewTag = new NewTag
}

class NewTag extends NewNode with TagBase {
  type StoredType = Tag

  var value: String = ""
  var name: String  = "<empty>"

  override def label: String = "TAG"

  override def copy: this.type = {
    val newInstance = new NewTag
    newInstance.name = this.name
    newInstance.value = this.value
    newInstance.asInstanceOf[this.type]
  }

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def value(value: String): this.type = {
    this.value = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!(("") == value)) { res += "VALUE" -> value }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.value
      case 1 => this.name
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "value"
      case 1 => "name"
      case _ => ""
    }

  override def productPrefix = "NewTag"
  override def productArity  = 2

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewTag]
}

object NewTagNodePair {
  def apply(): NewTagNodePair = new NewTagNodePair
}

class NewTagNodePair extends NewNode with TagNodePairBase {
  type StoredType = TagNodePair

  var tag: TagBase       = null
  var node: AbstractNode = null

  override def label: String = "TAG_NODE_PAIR"

  override def copy: this.type = {
    val newInstance = new NewTagNodePair
    newInstance.node = this.node
    newInstance.tag = this.tag
    newInstance.asInstanceOf[this.type]
  }

  def node(value: AbstractNode): this.type = {
    this.node = value
    this
  }

  def tag(value: TagBase): this.type = {
    this.tag = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((null) == node)) { res += "node" -> node }
    if (!((null) == tag)) { res += "tag" -> tag }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.tag
      case 1 => this.node
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "tag"
      case 1 => "node"
      case _ => ""
    }

  override def productPrefix = "NewTagNodePair"
  override def productArity  = 2

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewTagNodePair]
}

object NewTemplateDom {
  def apply(): NewTemplateDom = new NewTemplateDom
}

class NewTemplateDom extends NewNode with TemplateDomBase with ExpressionNew {
  type StoredType = TemplateDom

  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"
  var argumentName: Option[String]  = None
  var argumentIndex: scala.Int      = -1: Int

  override def label: String = "TEMPLATE_DOM"

  override def copy: this.type = {
    val newInstance = new NewTemplateDom
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.name
      case 2 => this.lineNumber
      case 3 => this.columnNumber
      case 4 => this.code
      case 5 => this.argumentName
      case 6 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "name"
      case 2 => "lineNumber"
      case 3 => "columnNumber"
      case 4 => "code"
      case 5 => "argumentName"
      case 6 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewTemplateDom"
  override def productArity  = 7

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewTemplateDom]
}

object NewType {
  def apply(): NewType = new NewType
}

class NewType extends NewNode with TypeBase {
  type StoredType = Type

  var typeDeclFullName: String = "<empty>"
  var name: String             = "<empty>"
  var fullName: String         = "<empty>"

  override def label: String = "TYPE"

  override def copy: this.type = {
    val newInstance = new NewType
    newInstance.fullName = this.fullName
    newInstance.name = this.name
    newInstance.typeDeclFullName = this.typeDeclFullName
    newInstance.asInstanceOf[this.type]
  }

  def fullName(value: String): this.type = {
    this.fullName = value
    this
  }

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def typeDeclFullName(value: String): this.type = {
    this.typeDeclFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == fullName)) { res += "FULL_NAME" -> fullName }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!(("<empty>") == typeDeclFullName)) { res += "TYPE_DECL_FULL_NAME" -> typeDeclFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeDeclFullName
      case 1 => this.name
      case 2 => this.fullName
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeDeclFullName"
      case 1 => "name"
      case 2 => "fullName"
      case _ => ""
    }

  override def productPrefix = "NewType"
  override def productArity  = 3

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewType]
}

object NewTypeArgument {
  def apply(): NewTypeArgument = new NewTypeArgument
}

class NewTypeArgument extends NewNode with TypeArgumentBase with AstNodeNew {
  type StoredType = TypeArgument

  var order: scala.Int              = -1: Int
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "TYPE_ARGUMENT"

  override def copy: this.type = {
    val newInstance = new NewTypeArgument
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.lineNumber
      case 2 => this.columnNumber
      case 3 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "lineNumber"
      case 2 => "columnNumber"
      case 3 => "code"
      case _ => ""
    }

  override def productPrefix = "NewTypeArgument"
  override def productArity  = 4

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewTypeArgument]
}

object NewTypeDecl {
  def apply(): NewTypeDecl = new NewTypeDecl
}

class NewTypeDecl extends NewNode with TypeDeclBase with AstNodeNew {
  type StoredType = TypeDecl

  var order: scala.Int                             = -1: Int
  var name: String                                 = "<empty>"
  var lineNumber: Option[Integer]                  = None
  var isExternal: Boolean                          = false
  var inheritsFromTypeFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var fullName: String                             = "<empty>"
  var filename: String                             = "<empty>"
  var columnNumber: Option[Integer]                = None
  var code: String                                 = "<empty>"
  var astParentType: String                        = "<empty>"
  var astParentFullName: String                    = "<empty>"
  var aliasTypeFullName: Option[String]            = None

  override def label: String = "TYPE_DECL"

  override def copy: this.type = {
    val newInstance = new NewTypeDecl
    newInstance.aliasTypeFullName = this.aliasTypeFullName
    newInstance.astParentFullName = this.astParentFullName
    newInstance.astParentType = this.astParentType
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.filename = this.filename
    newInstance.fullName = this.fullName
    newInstance.inheritsFromTypeFullName = this.inheritsFromTypeFullName
    newInstance.isExternal = this.isExternal
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def aliasTypeFullName(value: String): this.type = {
    this.aliasTypeFullName = Option(value)
    this
  }

  def aliasTypeFullName(value: Option[String]): this.type = aliasTypeFullName(value.orNull)

  def astParentFullName(value: String): this.type = {
    this.astParentFullName = value
    this
  }

  def astParentType(value: String): this.type = {
    this.astParentType = value
    this
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def filename(value: String): this.type = {
    this.filename = value
    this
  }

  def fullName(value: String): this.type = {
    this.fullName = value
    this
  }

  def inheritsFromTypeFullName(value: IterableOnce[String]): this.type = {
    this.inheritsFromTypeFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def isExternal(value: Boolean): this.type = {
    this.isExternal = value
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    aliasTypeFullName.map { value => res += "ALIAS_TYPE_FULL_NAME" -> value }
    if (!(("<empty>") == astParentFullName)) { res += "AST_PARENT_FULL_NAME" -> astParentFullName }
    if (!(("<empty>") == astParentType)) { res += "AST_PARENT_TYPE" -> astParentType }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == filename)) { res += "FILENAME" -> filename }
    if (!(("<empty>") == fullName)) { res += "FULL_NAME" -> fullName }
    if (inheritsFromTypeFullName != null && inheritsFromTypeFullName.nonEmpty) {
      res += "INHERITS_FROM_TYPE_FULL_NAME" -> inheritsFromTypeFullName
    }
    if (!((false) == isExternal)) { res += "IS_EXTERNAL" -> isExternal }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0  => this.order
      case 1  => this.name
      case 2  => this.lineNumber
      case 3  => this.isExternal
      case 4  => this.inheritsFromTypeFullName
      case 5  => this.fullName
      case 6  => this.filename
      case 7  => this.columnNumber
      case 8  => this.code
      case 9  => this.astParentType
      case 10 => this.astParentFullName
      case 11 => this.aliasTypeFullName
      case _  => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0  => "order"
      case 1  => "name"
      case 2  => "lineNumber"
      case 3  => "isExternal"
      case 4  => "inheritsFromTypeFullName"
      case 5  => "fullName"
      case 6  => "filename"
      case 7  => "columnNumber"
      case 8  => "code"
      case 9  => "astParentType"
      case 10 => "astParentFullName"
      case 11 => "aliasTypeFullName"
      case _  => ""
    }

  override def productPrefix = "NewTypeDecl"
  override def productArity  = 12

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewTypeDecl]
}

object NewTypeParameter {
  def apply(): NewTypeParameter = new NewTypeParameter
}

class NewTypeParameter extends NewNode with TypeParameterBase with AstNodeNew {
  type StoredType = TypeParameter

  var order: scala.Int              = -1: Int
  var name: String                  = "<empty>"
  var lineNumber: Option[Integer]   = None
  var columnNumber: Option[Integer] = None
  var code: String                  = "<empty>"

  override def label: String = "TYPE_PARAMETER"

  override def copy: this.type = {
    val newInstance = new NewTypeParameter
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.lineNumber = this.lineNumber
    newInstance.name = this.name
    newInstance.order = this.order
    newInstance.asInstanceOf[this.type]
  }

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def name(value: String): this.type = {
    this.name = value
    this
  }

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!(("<empty>") == name)) { res += "NAME" -> name }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.order
      case 1 => this.name
      case 2 => this.lineNumber
      case 3 => this.columnNumber
      case 4 => this.code
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "order"
      case 1 => "name"
      case 2 => "lineNumber"
      case 3 => "columnNumber"
      case 4 => "code"
      case _ => ""
    }

  override def productPrefix = "NewTypeParameter"
  override def productArity  = 5

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewTypeParameter]
}

object NewTypeRef {
  def apply(): NewTypeRef = new NewTypeRef
}

class NewTypeRef extends NewNode with TypeRefBase with ExpressionNew {
  type StoredType = TypeRef

  var typeFullName: String                        = "<empty>"
  var order: scala.Int                            = -1: Int
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var argumentName: Option[String]                = None
  var argumentIndex: scala.Int                    = -1: Int

  override def label: String = "TYPE_REF"

  override def copy: this.type = {
    val newInstance = new NewTypeRef
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.order
      case 2 => this.lineNumber
      case 3 => this.dynamicTypeHintFullName
      case 4 => this.columnNumber
      case 5 => this.code
      case 6 => this.argumentName
      case 7 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "order"
      case 2 => "lineNumber"
      case 3 => "dynamicTypeHintFullName"
      case 4 => "columnNumber"
      case 5 => "code"
      case 6 => "argumentName"
      case 7 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewTypeRef"
  override def productArity  = 8

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewTypeRef]
}

object NewUnknown {
  def apply(): NewUnknown = new NewUnknown
}

class NewUnknown extends NewNode with UnknownBase with ExpressionNew {
  type StoredType = Unknown

  var typeFullName: String                        = "<empty>"
  var parserTypeName: String                      = "<empty>"
  var order: scala.Int                            = -1: Int
  var lineNumber: Option[Integer]                 = None
  var dynamicTypeHintFullName: IndexedSeq[String] = collection.immutable.ArraySeq.empty
  var containedRef: String                        = "<empty>"
  var columnNumber: Option[Integer]               = None
  var code: String                                = "<empty>"
  var argumentName: Option[String]                = None
  var argumentIndex: scala.Int                    = -1: Int

  override def label: String = "UNKNOWN"

  override def copy: this.type = {
    val newInstance = new NewUnknown
    newInstance.argumentIndex = this.argumentIndex
    newInstance.argumentName = this.argumentName
    newInstance.code = this.code
    newInstance.columnNumber = this.columnNumber
    newInstance.containedRef = this.containedRef
    newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
    newInstance.lineNumber = this.lineNumber
    newInstance.order = this.order
    newInstance.parserTypeName = this.parserTypeName
    newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  def argumentIndex(value: scala.Int): this.type = {
    this.argumentIndex = value
    this
  }

  def argumentName(value: String): this.type = {
    this.argumentName = Option(value)
    this
  }

  def argumentName(value: Option[String]): this.type = argumentName(value.orNull)

  def code(value: String): this.type = {
    this.code = value
    this
  }

  def columnNumber(value: Integer): this.type = {
    this.columnNumber = Option(value)
    this
  }

  def columnNumber(value: Option[Integer]): this.type = columnNumber(value.orNull)

  def containedRef(value: String): this.type = {
    this.containedRef = value
    this
  }

  def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {
    this.dynamicTypeHintFullName = value.iterator.to(collection.immutable.ArraySeq)
    this
  }

  def lineNumber(value: Integer): this.type = {
    this.lineNumber = Option(value)
    this
  }

  def lineNumber(value: Option[Integer]): this.type = lineNumber(value.orNull)

  def order(value: scala.Int): this.type = {
    this.order = value
    this
  }

  def parserTypeName(value: String): this.type = {
    this.parserTypeName = value
    this
  }

  def typeFullName(value: String): this.type = {
    this.typeFullName = value
    this
  }

  override def properties: Map[String, Any] = {
    var res = Map[String, Any]()
    if (!((-1: Int) == argumentIndex)) { res += "ARGUMENT_INDEX" -> argumentIndex }
    argumentName.map { value => res += "ARGUMENT_NAME" -> value }
    if (!(("<empty>") == code)) { res += "CODE" -> code }
    columnNumber.map { value => res += "COLUMN_NUMBER" -> value }
    if (!(("<empty>") == containedRef)) { res += "CONTAINED_REF" -> containedRef }
    if (dynamicTypeHintFullName != null && dynamicTypeHintFullName.nonEmpty) {
      res += "DYNAMIC_TYPE_HINT_FULL_NAME" -> dynamicTypeHintFullName
    }
    lineNumber.map { value => res += "LINE_NUMBER" -> value }
    if (!((-1: Int) == order)) { res += "ORDER" -> order }
    if (!(("<empty>") == parserTypeName)) { res += "PARSER_TYPE_NAME" -> parserTypeName }
    if (!(("<empty>") == typeFullName)) { res += "TYPE_FULL_NAME" -> typeFullName }
    res
  }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.typeFullName
      case 1 => this.parserTypeName
      case 2 => this.order
      case 3 => this.lineNumber
      case 4 => this.dynamicTypeHintFullName
      case 5 => this.containedRef
      case 6 => this.columnNumber
      case 7 => this.code
      case 8 => this.argumentName
      case 9 => this.argumentIndex
      case _ => null
    }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "typeFullName"
      case 1 => "parserTypeName"
      case 2 => "order"
      case 3 => "lineNumber"
      case 4 => "dynamicTypeHintFullName"
      case 5 => "containedRef"
      case 6 => "columnNumber"
      case 7 => "code"
      case 8 => "argumentName"
      case 9 => "argumentIndex"
      case _ => ""
    }

  override def productPrefix = "NewUnknown"
  override def productArity  = 10

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewUnknown]
}
