import React from 'react';
import CardProps from './Card.type';


export const Card = ({
    title, body, footer, buttonLabel, buttonAction }: CardProps) => {


    return (
        <>
            <div className="card-title">
                {title}
            </div>
            <div className="card-body">
                {body}
            </div>
            {
                footer &&
                <div className="card-footer">
                    {footer}
                </div>
            }

            {
                buttonLabel &&
                <button>{buttonLabel}</button>
            }

        </>
    )
}
export default Card;