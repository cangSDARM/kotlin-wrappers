// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.payment

import seskar.js.JsValue
import web.events.EventType

sealed external interface PaymentMethodChangeEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PaymentMethodChangeEvent.paymentMethodChange()"),
    )
    @JsValue("paymentmethodchange")
    val PAYMENT_METHOD_CHANGE: EventType<PaymentMethodChangeEvent<*>>
        get() = definedExternally
}